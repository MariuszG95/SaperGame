package mineSweeperGame;


import sun.plugin2.message.Message;

import static mineSweeperGame.MoveType.MARKASBOMB;

public class Board {

    private GameState gameState;
    private Cell[][] cells;
    private String[][] displayArray;
    private CellBoardGenerator cellBoardGenerator;
    private Difficulty difficulty;

    int counterOfMarkedBombs = 0;
    int counterOfMarkedCells = 0;

    public Board(Difficulty difficulty) {
        cellBoardGenerator = new CellBoardGenerator();
        this.difficulty = difficulty;
        this.gameState = GameState.INPROGRESS;
        this.cells = cellBoardGenerator.generateCells(difficulty.getCol(), difficulty.getRow(), difficulty.getNumberOfBombs());
        this.displayArray = cellBoardGenerator.generateCoveredDisplayArray(difficulty.getCol(), difficulty.getRow());
    }

    public void makeAMove(MoveType move, int row, int col) {

        switch (move) {

            case CLICK:
                displayArray[row][col] = (cells[row][col].getBombsAround()).toString();
                if (cells[row][col].getBombsAround()==0){


                }

                if (cells[row][col].getIsABomb()) {
                    displayArray[row][col] = "\u263B";
                    Messages.lostingMessage();
                    gameState = gameState.LOST;
                }
                break;
            case MARKASBOMB:

                if (counterOfMarkedCells == difficulty.getNumberOfBombs()) {
                    System.out.println("odznacz cos");
                    break;
                }
                displayArray[row][col] = "\u2020";
                counterOfMarkedCells++;
                if (cells[row][col].getIsABomb()) {
                    counterOfMarkedBombs++;
                    Messages.afterMarkABomb();
                }

                if (counterOfMarkedBombs == difficulty.getNumberOfBombs()) {
                    this.gameState = gameState.WON;
                    Messages.winningMessage();
                }
                displayArray[row][col] = "\u2020";
                break;

            case UNMARKED:
                if (displayArray[row][col].equals("\u2020")) {
                    displayArray[row][col] = "\u25A0";
                    Messages.afterUnmarkABomb();
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