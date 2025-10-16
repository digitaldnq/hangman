package org.example;

import java.io.*;
import java.util.*;

public class DictionaryStart implements Serializable {
    @Serial
    private static final long serialVersionUID = -1838814174022527078L;


    public static void main(String[] args) throws FileNotFoundException {
        HashMap<Integer, String> dictionary = new HashMap<>();
        File file = new File("C:/Users/denqc/OneDrive/Desktop/Dictionary.txt");
        Scanner scanner = new Scanner(file);
        int i = 0;

        while (scanner.hasNextLine()) {
            dictionary.put(i, scanner.nextLine());
            i++;
        }
        scanner.close();

        // try catch block
        try {
            FileOutputStream fos
                    = new FileOutputStream(
                    "src/main/resources/lewa");

            ObjectOutputStream oos
                    = new ObjectOutputStream(fos);

            oos.writeObject(dictionary);

            // closing FileOutputStream and
            // ObjectOutputStream
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}