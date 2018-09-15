package mineSweeperGame;

import static mineSweeperGame.MoveType.MARKASBOMB;

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
        switch (move){
            case CLICK:
                displayArray[row][col] = (cells[row][col].getBombsAround()).toString();
                if (cells[row][col].getIsABomb()){
                    displayArray[row][col] = "\u263b";
                    this.gameState = gameState.LOST;
                    System.out.println("PRZRGRAŁEś");
                }

                break;
            case MARKASBOMB:
                    displayArray[row][col] = "\u2020";

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
