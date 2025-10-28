package org.example;

import java.util.Scanner;

public class Game {

    private final MaskedWord maskedWord = new MaskedWord();
    private static final int TRIES = 6;

    public void start(){
        Scanner scanner = new Scanner(System.in);
        String option;

        while (true) {
            System.out.println("Добро пожаловать в игру нажмите [Y] чтобы начать игру и [N] чтобы покинуть игру");
            option = scanner.nextLine();

            if(option.equalsIgnoreCase("Y")){
                maskedWord.setWord();
                maskedWord.setMask(maskedWord.getWord());
                System.out.println(maskedWord.getMask());
                String letter;

                while (!maskedWord.gameWon() && incorrectTries < TRIES) {

                    System.out.println("Введите букву: ");
                    letter = scanner.nextLine();

                    if (maskedWord.isLetterAlreadyUsed(letter)) {
                        System.out.println("Эта буква уже есть: " + letter);
                    } else {
                        maskedWord.userLetterInput(letter);
                        maskedWord.updateMask(letter);
                    }
                }

            } else if (option.equalsIgnoreCase("N")){
                System.out.println("Выход из игры");
                System.exit(0);
            }
        }

    }
}