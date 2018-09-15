package mineSweeperGame;

import static mineSweeperGame.MoveType.CLICK;
import static mineSweeperGame.MoveType.MARKASBOMB;
import static mineSweeperGame.MoveType.UNMARKED;

public class Board {

    private GameState gameState;
    private Cell[][] cells;
    private String[][] displayArray;
    private CellBoardGenerator cellBoardGenerator;


    public Board(Difficulty difficulty) {
        cellBoardGenerator = new CellBoardGenerator();
        this.gameState = GameState.INPROGRESS;
        this.cells = cellBoardGenerator.generateCells(difficulty.getCol(), difficulty.getRow(), difficulty.getNumberOfBombs());
        this.displayArray = cellBoardGenerator.generateCoveredDisplayArray(difficulty.getCol(), difficulty.getRow());
    }

    public void makeAMove(MoveType move, int row, int col) {
        switch (move) {
            case CLICK:
                displayArray[row][col] = (cells[row][col].getBombsAround()).toString();
                if (cells[row][col].getIsABomb()) {
                    displayArray[row][col] = "\u263B";
                    System.out.println("BOMBA!!! Przegrałeś!");
                    gameState = gameState.LOST;
                }
                break;
            case MARKASBOMB:
                displayArray[row][col] = "\u2020";

                break;

            case UNMARKED:
                if (displayArray[row][col].equals("\u2020")) {
                    displayArray[row][col] = "\u25A0";
                }
                break;


        }


    }

    public String[][] getDisplayArray() {
        return displayArray;
    }

    public GameState getGameState() {
        return gameState;
    }


}
