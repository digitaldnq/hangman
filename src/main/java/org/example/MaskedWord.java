package org.example;

import java.util.*;

public class MaskedWord {

    private String word; // загаданное слово
    private String[] mask; // маска слова
    private final Set<String> usedLetters = new HashSet<>();

    public void setWord() { // генерация рандом слова
        HashMap<Integer, String> map = DictionaryEnd.deserializedHashMap("src/main/resources/lewa");
        int digit = (int) (Math.random() * map.size());
        System.out.println("Слово загаданно.");
        this.word = map.get(digit).toUpperCase();
    }

    public void setMask(String word) { // генерация маски
        mask = new String[word.length()];
        Arrays.fill(mask, "*");
    }

    public void userLetterInput(String letter) { // выбор буквы пользователя
        usedLetters.add(letter);
    }

    public boolean isLetterAlreadyUsed(String letter) { // буквы которые уже есть
        return usedLetters.contains(letter);
    }

    public void showAllUserInputs(){
        System.out.println(usedLetters);
    }

    void updateMask(String letter) {
        for (int i = 0; i < word.length(); i++) {
            if (Character.toString(word.charAt(i)).equalsIgnoreCase(letter)) {
                mask[i] = letter;
                System.out.println(Arrays.toString(mask).toUpperCase());
            }
        }
    }

    public boolean isLetterInWord(String letter) {
        return word.contains(letter.toUpperCase());
    }

    public boolean gameWon() {
        return Arrays.stream(mask).noneMatch(x -> x.equals("*"));
    }

    public String getWord() {
        return word;
    }

    public String getMask() {
        return Arrays.toString(mask);
    }
}
