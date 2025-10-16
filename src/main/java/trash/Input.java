package trash;

import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);

    public static String userInput() {
        System.out.println("Введите букву: ");
        return scanner.nextLine();
    }

}
