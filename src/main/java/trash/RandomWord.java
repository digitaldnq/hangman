/*
package trash;

import org.example.DictionaryEnd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RandomWord {

    static ArrayList<String> letterPoolNew = new ArrayList<>(32);


    public static void main(String[] args) {
        String generatedWord = "";
        generatedWord = generateWord(generatedWord);
        maskedWord(generatedWord);
        System.out.println();
        useLetters(String.valueOf(letterPoolNew), generatedWord);
    }


    public static String generateWord(String str) {
        HashMap<Integer, String> map = DictionaryEnd.deserializedHashMap("src/main/resources/lewa");
        int digit = (int) (Math.random() * 1000);
        map.get(digit);
        System.out.println("Слово загаданно!");
        System.out.println(map.get(digit).toUpperCase());
        return map.get(digit).toUpperCase();
    }

    public static void maskedWord(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.replaceAll(str, "*"));
        }
    }

    public static ArrayList<String> useLetters(String letter, String generatedWord) {
        for (int i = 0; i < generatedWord.length(); i++) {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            letterPoolNew.add(str);
        }

        return letterPoolNew;
    }


}
*/
