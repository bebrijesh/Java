import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessGame {
    public static void main(String[] args) {
        // Game introduction.
        System.out.println("Welcome to Random Number Guess Game.");
        System.out.print("Enter your name: ");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello! " + userName);

        // Game main menu.
        System.out.println("Should we start the game");
        System.out.println("\t1. Yes");
        System.out.println("\t2. No");

        int userAnswer = scanner.nextInt();

        // Game menu will repeat itself until game start.
        while (userAnswer != 1) {
            System.out.println("Should we start the game?");
            System.out.println("\t1. Yes");
            System.out.println("\t2. No");

            userAnswer = scanner.nextInt();
        }

        // Random number generate.
        Random randomNumberGenerate = new Random();
        int randomNumber = randomNumberGenerate.nextInt(5) + 1;
        System.out.println("Random number is between 1 to 5.");
        System.out.println("Guess the random number generate.");
        System.out.print("Enter the random number: ");
        int userInputRandomNumber = scanner.nextInt();

        int timesTried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        // Game logic.
        while (!shouldFinish) {
            timesTried++;

            // 5 chance to user guess the right number.
            if (timesTried < 5) {
                // Comparing user number and random number.
                if (userInputRandomNumber == randomNumber) {
                    hasWon = true;
                    shouldFinish = true;
                } else if (userInputRandomNumber > randomNumber) {
                    System.out.println("Guess lower number");
                    userInputRandomNumber = scanner.nextInt();
                } else {
                    System.out.println("Guess higher number");
                    userInputRandomNumber = scanner.nextInt();
                }
            } else {
                shouldFinish = true;
            }
        }

        // Game win message or Game over message
        if (hasWon) {
            System.out.println("Congratulations! you win. You tried " + timesTried);
        } else {
            System.out.println("Game Over");
            System.out.println("The number was: " + randomNumber);
        }
    }
}

