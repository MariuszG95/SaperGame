package mineSweeperGame;

import java.util.Random;

public class Messages {

    public static int giveMeRandomNumber(int bound) {
        Random random = new Random();
        return random.nextInt(bound + 1);
    }

    public static void easyDificultyMessage() {
        int numberOfAvailableMessages = 3;
        String message = null;
        switch (giveMeRandomNumber(numberOfAvailableMessages - 1)) {
            case 0:
                message = "Stać Cie na wiecej!";
                break;
            case 1:
                message = "Powaznie?";
                break;
            case 2:
                message = "Nudy!";
                break;
        }
        System.out.println(message);
    }

    public static void mediumDificultyMessage() {
        int numberOfAvailableMessages = 3;
        String message = null;
        switch (giveMeRandomNumber(numberOfAvailableMessages - 1)) {
            case 0:
                message = "O tak!";
                break;
            case 1:
                message = "No w koncu cos sie dzieje...";
                break;
            case 2:
                message = "Powodzenia kolego! (lub kolezanko :D)";
                break;
        }
        System.out.println(message);
    }

    public static void hardDificultyMessage() {
        int numberOfAvailableMessages = 3;
        String message = null;
        switch (giveMeRandomNumber(numberOfAvailableMessages - 1)) {
            case 0:
                message = "No chyba Cie matka nie kocha...";
                break;
            case 1:
                message = "Uuu... Lubisz wyzwania! Lubie Cie ;)";
                break;
            case 2:
                message = "Nie wiem czy wiesz, ale jak przegrasz to uruchomisz komende \"format c\"... wiec zycze powodzenia :D";
                break;
        }
        System.out.println(message);
    }

    public static void winningMessage() {
        int numberOfAvailableMessages = 3;
        String message = null;
        switch (giveMeRandomNumber(numberOfAvailableMessages - 1)) {
            case 0:
                message = "Nie spodziewalem sie tego!";
                break;
            case 1:
                message = "Bylem pewny, ze przegrasz.";
                break;
            case 2:
                message = "Moje gratulacje...";
                break;
        }
        System.out.println(message);
    }

    public static void lostingMessage() {
        int numberOfAvailableMessages = 3;
        String message = null;
        switch (giveMeRandomNumber(numberOfAvailableMessages - 1)) {
            case 0:
                message = "Ha! Wiedzialem! Przegrales!";
                break;
            case 1:
                message = "Hahahahahaha! Przegrales!";
                break;
            case 2:
                message = "Moze nastepnym razem sie uda ;)";
                break;
        }
        System.out.println(message);
    }

    public static void afterMove() {
        int numberOfAvailableMessages = 6;
        String message = null;
        switch (giveMeRandomNumber(numberOfAvailableMessages - 1)) {
            case 0:
                message = "Bylo blisko!";
                break;
            case 1:
                message = "Nie chce nic mowic, ale obok jest bomba...";
                break;
            case 2:
                message = "Juz nie duzo zostalo...";
                break;
            case 3:
                message = "Ja bym wybral cos innego...";
                break;
            case 4:
                message = "Ty chyba nie wiesz co robisz...";
                break;
            case 5:
                message = "Bylem pewny, ze tam jest bomba!";
                break;
        }
        System.out.println(message);
    }

    public static void afterMarkABomb() {
        int numberOfAvailableMessages = 3;
        String message = null;
        switch (giveMeRandomNumber(numberOfAvailableMessages - 1)) {
            case 0:
                message = "Nie jestem taki pewny...";
                break;
            case 1:
                message = "Chyba nie wiesz co robisz...";
                break;
            case 2:
                message = "Dobry wybor!";
                break;
        }
        System.out.println(message);
    }

    public static void afterUnmarkABomb() {
        int numberOfAvailableMessages = 3;
        String message = null;
        switch (giveMeRandomNumber(numberOfAvailableMessages - 1)) {
            case 0:
                message = "Jednak nie jestes taki pewny?";
                break;
            case 1:
                message = "A jednak!";
                break;
            case 2:
                message = "Tam jest bomba... mowie ci...";
                break;
        }
        System.out.println(message);
    }

    public static void tooManyMarkedBombs() {
        int numberOfAvailableMessages = 3;
        String message = null;
        switch (giveMeRandomNumber(numberOfAvailableMessages - 1)) {
            case 0:
                message = "Za duzo bomb na tej planszy widzisz... tu jest tylko ";
                break;
            case 1:
                message = "";
                break;
            case 2:
                message = "";
                break;
        }
        System.out.println(message);
    }

}
