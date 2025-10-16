package trash;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class probe {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/Users/denqc/OneDrive/Desktop/Dictionary.txt");
        Scanner scanner = new Scanner(file);

        for (int i = 0; i < 3; i++) {
            System.out.println(scanner.nextLine());
        }
    }
}
