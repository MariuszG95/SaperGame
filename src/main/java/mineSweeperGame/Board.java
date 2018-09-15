package mineSweeperGame;


import static mineSweeperGame.MoveType.MARKASBOMB;

public class Board {

    private GameState gameState;
    private Cell[][] cells;
    private String[][] displayArray;
    private CellBoardGenerator cellBoardGenerator;
    private Difficulty difficulty;

    private int counterOfMarkedBombs = 0;
    private int counterOfMarkedCells = 0;

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

                if (cells[row][col].getIsABomb()) {
                    displayArray[row][col] = "\u263B";
                    Messages.lostingMessage();
                    gameState = gameState.LOST;
                    for (int i = 0; i < displayArray.length; i++) {
                        for (int j = 0; j < displayArray[0].length; j++) {
                            if (cells[i][j].getIsABomb()) {
                                displayArray[i][j] = "\u263B";
                            } else {
                                displayArray[i][j] = String.valueOf((cells[i][j]).getBombsAround());
                            }

                        }
                    }

                } else {
                    displayArray[row][col] = (cells[row][col].getBombsAround()).toString();
                    if (cells[row][col].getBombsAround() == 0) {
                        displayArray[row][col] = "\u25A1";


                    }
                }

                break;
            case MARKASBOMB:

                if (counterOfMarkedCells == difficulty.getNumberOfBombs()) {
                    Messages.tooManyMarkedBombs();
                    break;
                }
                displayArray[row][col] = "\u2020";
                counterOfMarkedCells++;
                if (cells[row][col].getIsABomb()) {
                    Messages.afterMarkABomb();
                    counterOfMarkedBombs++;
                }

                if (counterOfMarkedBombs == difficulty.getNumberOfBombs()) {
                    this.gameState = gameState.WON;
                }
                displayArray[row][col] = "\u2020";
                Messages.winningMessage();
                break;

            case UNMARKED:
                if (displayArray[row][col].equals("\u2020")) {
                    displayArray[row][col] = "\u25A0";
                    counterOfMarkedCells--;
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
