package mineSweeperGame;

import java.util.Scanner;

public class MineSweeper {
    Board board;

    public void play() {


        System.out.println("Podaj poziom trudności: EASY(e), MEDIUM(m), HARD(h)");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        switch (c) {

            case 'h':
                board = new Board(Difficulty.HARD);
                System.out.println("Podziwiam!");
                System.out.println("Powodzenia!");
                break;
            case 'e':
                board = new Board(Difficulty.EASY);
                System.out.println("Jesteś mało ambitny!");
                System.out.println("Powodzenia!");
                break;
            case 'm':
                board = new Board(Difficulty.MEDIUM);
                System.out.println("Tak w sam raz!");
                System.out.println("Powodzenia!");
                break;
            default:
                break;
        }

        Display display = new Display();
        do {
            display.printDisplay(board.getDisplayArray());
            System.out.println();
            askForMove();

        } while (board.getGameState().equals(GameState.INPROGRESS));



    }

    private void askForMove() {

        System.out.println("Wykonaj ruch: ZAZNACZ BOMBĘ (b), ODKRYJ POLE (o), ODZNACZ BOMBĘ (x)");
        int row = 0;
        int col = 0;
        char move = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            char rowChar = input.charAt(0);
            row = (int) rowChar - 97;
            col = (Integer.parseInt(String.valueOf(input.charAt(1)))) - 1;
            move = input.charAt(2);


        switch (move) {

            case 'b':
               board.makeAMove(MoveType.MARKASBOMB, row, col);
                break;
            case 'o':
               board.makeAMove(MoveType.CLICK, row, col);
                break;
            case 'x':
                board.makeAMove(MoveType.UNMARKED, row, col);
            default:
                break;
        }
        } catch (IndexOutOfBoundsException|NumberFormatException ex) {
            askForMove();
        }
    }
}
