package mineSweeperGame;

import java.util.Random;

public class Messages {

    public static int giveMeRandomNumber(int bound) {
        Random random = new Random();
        return random.nextInt(bound + 1);
    }

    public static String easyDificultyMessage() {
        int numberOfAvailableMessages = 3;
        String Message = null;
        switch (giveMeRandomNumber(numberOfAvailableMessages - 1)) {
            case 0:
                Message = "Stać Cie na wiecej!";
                break;
            case 1:
                Message = "Powaznie?";
                break;
            case 2:
                Message = "Nudy!";
                break;
        }
        return Message;
    }

    public static String mediumDificultyMessage() {
        int numberOfAvailableMessages = 3;
        String Message = null;
        switch (giveMeRandomNumber(numberOfAvailableMessages - 1)) {
            case 0:
                Message = "O tak!";
                break;
            case 1:
                Message = "No w koncu cos sie dzieje...";
                break;
            case 2:
                Message = "Powodzenia kolego! (lub kolezanko :D)";
                break;
        }
        return Message;
    }

    public static String hardDificultyMessage() {
        int numberOfAvailableMessages = 3;
        String Message = null;
        switch (giveMeRandomNumber(numberOfAvailableMessages - 1)) {
            case 0:
                Message = "No chyba Cie matka nie kocha...";
                break;
            case 1:
                Message = "Uuu... Lubisz wyzwania! Lubie Cie ;)";
                break;
            case 2:
                Message = "Nie wiemczy wiesz, ale jak przegrasz to uruchomisz komende \"format c\"... wiec zycze powodzenia :D";
                break;
        }
        return Message;
    }

    public static String winningMessage() {
        int numberOfAvailableMessages = 3;
        String Message = null;
        switch (giveMeRandomNumber(numberOfAvailableMessages - 1)) {
            case 0:
                Message = "Nie spodziewalem sie tego!";
                break;
            case 1:
                Message = "Bylem pewny, ze przegrasz.";
                break;
            case 2:
                Message = "Moje gratulacje...";
                break;
        }
        return Message;
    }

    public static String lostingMessage() {
        int numberOfAvailableMessages = 3;
        String Message = null;
        switch (giveMeRandomNumber(numberOfAvailableMessages - 1)) {
            case 0:
                Message = "Ha! Wiedzialem!";
                break;
            case 1:
                Message = "Hahahahahaha!";
                break;
            case 2:
                Message = "Moze nastepnym razem sie uda ;)";
                break;
        }
        return Message;
    }

    public static String afterMove() {
        int numberOfAvailableMessages = 6;
        String Message = null;
        switch (giveMeRandomNumber(numberOfAvailableMessages - 1)) {
            case 0:
                Message = "Bylo blisko!";
                break;
            case 1:
                Message = "Nie chce nic mowic, ale obok jest bomba...";
                break;
            case 2:
                Message = "Juz nie duzo zostalo...";
                break;
            case 3:
                Message = "Ja bym wybral cos innego...";
                break;
            case 4:
                Message = "Ty chyba nie wiesz co robisz...";
                break;
            case 5:
                Message = "Bylem pewny, ze tam jest bomba!";
                break;
        }
        return Message;
    }

    public static String afterMarkABomb() {
        int numberOfAvailableMessages = 3;
        String Message = null;
        switch (giveMeRandomNumber(numberOfAvailableMessages - 1)) {
            case 0:
                Message = "Nie jestem taki pewny...";
                break;
            case 1:
                Message = "Chyba nie wiesz co robisz...";
                break;
            case 2:
                Message = "Dobry wybor!";
                break;
        }
        return Message;
    }

    public static String afterUnmarkABomb() {
        int numberOfAvailableMessages = 3;
        String Message = null;
        switch (giveMeRandomNumber(numberOfAvailableMessages - 1)) {
            case 0:
                Message = "Jednak nie jestes taki pewny?";
                break;
            case 1:
                Message = "A jednak!";
                break;
            case 2:
                Message = "Tam jest bomba... mowie ci...";
                break;
        }
        return Message;
    }

}
