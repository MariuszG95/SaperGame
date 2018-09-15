package mineSweeperGame;

import java.util.Scanner;

public class MineSweeper {
    Board board;

    public void play() {


        System.out.println("podaj poziom");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        switch (c) {

            case 'h':
                board = new Board(Difficulty.HARD);
                break;
            case 'e':
                board = new Board(Difficulty.EASY);
                break;
            case 'm':
                board = new Board(Difficulty.MEDIUM);
                break;
            default:
                break;
        }

        Display display = new Display();

        display.printDisplay(board.getDisplayArray());
        System.out.println();
        System.out.println("zrob ruch: podaj pole i co chcesz zrobic (b-oznacz jako bombe, o - odkryj pole)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char rowChar = input.charAt(0);
        int row = (int) rowChar - 97;
        int col = (Integer.parseInt(String.valueOf(input.charAt(1)))) - 1;
        char move = input.charAt(2);

        switch (move) {

            case 'b':
               board.makeAMove(MoveType.MARKASBOMB, row, col);
                break;
            case 'o':
               board.makeAMove(MoveType.CLICK, row, col);
                break;
            default:
                break;
        }

    }
}
