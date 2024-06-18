// THIS IS THE FIRST PROJECT ABOUT A NUMBER GAME IN JAVA

import java.util.Random;
import java.util.Scanner;

public class Numbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int totalScore = 0;
        int rounds = 0;

        while (playAgain) {
            int randomNumber = random.nextInt(100) + 1;
            int attempts = 0;
            boolean correctGuess = false;
            int maxAttempts = 10;

            System.out.println("Guess the number between 1 and 100. You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts && !correctGuess) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Congrats! You guessed the right number.");
                    correctGuess = true;
                    totalScore += (maxAttempts - attempts + 1); //high score for fewer attempts
                } else if (userGuess < randomNumber) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }
            }

            if (!correctGuess) {
                System.out.println("Sorry, you've used all your attempts. The number was: " + randomNumber);
            }

            rounds++;
            System.out.println("Your total score after " + rounds + " rounds is: " + totalScore);
            System.out.print("Do you want to play again? (yes/no): ");
            String userResponse = scanner.next();

            playAgain = userResponse.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing  Your final score is: " + totalScore + "\n Adios");
        scanner.close();
    }
}
