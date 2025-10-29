package org.example;

public class HangmanDrawer {

    private static final String[][] hangmanPic = {{
            "  +---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=============\n"},
            {"  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=============\n"} ,
            {"  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=============\n"} ,
            {"  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=============\n"} ,
            {"  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=============\n"} ,
            {"  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=============\n"},
            {"  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "=============\n"}};

    public void drawHangman(int incorrectTry){
        switch (incorrectTry){
            case 1:
                System.out.println(hangmanPic[0][0]);
                break;
            case 2:
                System.out.println(hangmanPic[1][0]);
                break;
            case 3:
                System.out.println(hangmanPic[2][0]);
                break;
            case 4:
                System.out.println(hangmanPic[3][0]);
                break;
            case 5:
                System.out.println(hangmanPic[4][0]);
                break;
            case 6:
                System.out.println(hangmanPic[5][0]);
                break;
            case 7:
                System.out.println(hangmanPic[6][0]);
                break;
        }
    }

}
