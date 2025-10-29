package org.example;

import java.util.Scanner;

public class Game {

    private final MaskedWord maskedWord = new MaskedWord();
    private static final int MAX_TRIES = 7;
    private final HangmanDrawer hangmanDrawer = new HangmanDrawer();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String option;

        while (true) {
            System.out.println("Добро пожаловать в игру нажмите [Y] чтобы начать игру и [N] чтобы покинуть игру");
            option = scanner.nextLine();

            if (option.equalsIgnoreCase("Y")) {
                maskedWord.setWord();
                maskedWord.setMask(maskedWord.getWord());
                System.out.println(maskedWord.getMask());
                String letter;
                int incorrectTries = 0;

                System.out.println("Всего 7 попыток.");

                while (!maskedWord.gameWon() && incorrectTries < MAX_TRIES) {

                    System.out.println("Введите букву: ");
                    letter = scanner.nextLine().toUpperCase();

                    if (maskedWord.isLetterAlreadyUsed(letter)) {
                        System.out.println("Эта буква уже есть: \nИспользованные буквы : ");

                        maskedWord.showAllUserInputs();
                    } else if (maskedWord.isLetterInWord(letter)) {
                        maskedWord.userLetterInput(letter);
                        maskedWord.updateMask(letter);
                    } else {
                        maskedWord.userLetterInput(letter);
                        incorrectTries++;
                        System.out.println();
                        System.out.println("Попытка номер : " + incorrectTries);
                        System.out.println();
                        hangmanDrawer.drawHangman(incorrectTries);

                        System.out.print("Использованные буквы : ");
                        maskedWord.showAllUserInputs();
                        if (incorrectTries >= MAX_TRIES) {
                            System.out.println("Загаданное слово : " + maskedWord.getWord());

                            System.out.println("Конец игры.");
                            System.exit(0);
                        }
                    }
                }
            } else if (option.equalsIgnoreCase("N")) {
                System.out.println("Выход из игры");
                System.exit(0);
            }
        }

    }
}