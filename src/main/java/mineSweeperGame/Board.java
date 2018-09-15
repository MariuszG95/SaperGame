package mineSweeperGame;

import static mineSweeperGame.MoveType.CLICK;

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

        }




    }

    public String[][] getDisplayArray() {
        return displayArray;
    }

    public GameState getGameState() {
        return gameState;
    }


}
