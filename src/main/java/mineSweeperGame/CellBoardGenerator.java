package mineSweeperGame;

import java.util.Random;

public class CellBoardGenerator {

    private Cell[][] cells;
    String[][] displayArray;


    public Cell[][] generateCells(int row, int col, int numberOfBombs) {
        cells = new Cell[row][col];


        generateCellsWithBomb(row, col, numberOfBombs);

        generateCellsWithoutBomb(row, col);

        generateCellsWithNumberOfBombsAround(row, col);


        return cells;
    }

    private void generateCellsWithoutBomb(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (cells[i][j] == null) {
                    Cell cell = new Cell();
                    cells[i][j] = cell;
                    cell.setIsABomb(false);
                    cell.setBombsAround(0);

                }

            }

        }
    }

    private void generateCellsWithBomb(int row, int col, int numberOfBombs) {
        for (int i = 0; i < numberOfBombs; i++) {
            Random randomCol = new Random();
            Random randomRow = new Random();
            int randomColInt = randomCol.nextInt(col);
            int randomRowInt = randomRow.nextInt(row);
            Cell cellWithBomb = new Cell();
            if (cells[randomRowInt][randomColInt] == null) {
                cells[randomRowInt][randomColInt] = cellWithBomb;
                cellWithBomb.setIsABomb(true);
            } else {
                i--;
            }


            //  cellWithBomb.setBombsAround(cellWithBomb.getBombsAround()+1);


        }
    }

    public void generateCellsWithNumberOfBombsAround(int row, int col) {
        Cell cellWithNumberOfBombs;

        for (int i = 1; i < row - 1; i++) {
            for (int j = 1; j < col - 1; j++) {


                if (cells[i][j].getIsABomb()) {
                    cells[i + 1][j].setBombsAround(1);
                    cells[i - 1][j].setBombsAround(1);
                    cells[i + 1][j + 1].setBombsAround(1);
                    cells[i + 1][j - 1].setBombsAround(1);
                    cells[i - 1][j + 1].setBombsAround(1);
                    cells[i - 1][j - 1].setBombsAround(1);
                    cells[i][j - 1].setBombsAround(1);
                    cells[i][j + 1].setBombsAround(1);
                }

            }
        }
        for (int j = 1; j < col - 1; j++) {
            int i = 0;
            if (cells[i][j].getIsABomb()) {
                cells[i + 1][j].setBombsAround(1);
                cells[i + 1][j + 1].setBombsAround(1);
                cells[i + 1][j - 1].setBombsAround(1);
                cells[i][j - 1].setBombsAround(1);
                cells[i][j + 1].setBombsAround(1);

            }
        }

        for (int j = 1; j < col - 1; j++) {
            int i = row - 1;
            if (cells[i][j].getIsABomb()) {
                cells[i - 1][j].setBombsAround(1);
                cells[i - 1][j + 1].setBombsAround(1);
                cells[i - 1][j - 1].setBombsAround(1);
                cells[i][j - 1].setBombsAround(1);
                cells[i][j + 1].setBombsAround(1);

            }

        }

        for (int i = 1; i < row - 1; i++) {
            int j = 0;
            if (cells[i][j].getIsABomb()) {
                cells[i + 1][j].setBombsAround(1);
                cells[i - 1][j].setBombsAround(1);
                cells[i + 1][j + 1].setBombsAround(1);
                cells[i - 1][j + 1].setBombsAround(1);
                cells[i][j + 1].setBombsAround(1);

            }

        }

        for (int i = 1; i < row - 1; i++) {
            int j = col - 1;
            if (cells[i][j].getIsABomb()) {
                cells[i + 1][j].setBombsAround(1);
                cells[i - 1][j].setBombsAround(1);
                cells[i + 1][j - 1].setBombsAround(1);
                cells[i - 1][j - 1].setBombsAround(1);
                cells[i][j - 1].setBombsAround(1);
            }
        }
        if (cells[0][0].getIsABomb()) {
            int i = 0;
            int j = 0;
            cells[i + 1][j].setBombsAround(1);
            cells[i][j + 1].setBombsAround(1);
            cells[i + 1][j + 1].setBombsAround(1);
        }

        if (cells[0][col - 1].getIsABomb()) {
            int j = col - 1;
            int i = 0;
            cells[i][j - 1].setBombsAround(1);
            cells[i + 1][j].setBombsAround(1);
            cells[i + 1][j - 1].setBombsAround(1);
        }

        if (cells[row - 1][0].getIsABomb()) {
            int j = 0;
            int i = row - 1;
            cells[i - 1][j].setBombsAround(1);
            cells[i - 1][j + 1].setBombsAround(1);
            cells[i][j + 1].setBombsAround(1);
        }

        if (cells[row - 1][col - 1].getIsABomb()) {
            int j = col - 1;
            int i = row - 1;
            cells[i - 1][j].setBombsAround(1);
            cells[i - 1][j - 1].setBombsAround(1);
            cells[i][j - 1].setBombsAround(1);
        }

    }

    public String[][] generateCoveredDisplayArray(int row, int col) {
        displayArray = new String[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                displayArray[i][j] = "\u25A0";

            }

        }

        return displayArray;
    }

}
