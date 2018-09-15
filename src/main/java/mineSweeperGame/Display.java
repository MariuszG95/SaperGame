package mineSweeperGame;

public class Display {

    private String[][] displayArray;


    public void printDisplay(String[][] displayArray) {
        int row = displayArray[0].length;
        int col = displayArray[1].length;


        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = 0; j < col; j++) {
                System.out.print(displayArray[i][j]);
            }

        }


    }

}
