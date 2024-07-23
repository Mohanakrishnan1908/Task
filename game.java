import java.util.Random;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxRange = 100;
        int maxAttempts = 10;
        int userScore = 0;
        boolean playAgain = true;
        System.out.println("Welcome to the Number Guessing Game!");
        while (playAgain) {
            int randomNumber = random.nextInt(maxRange) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;
            System.out.println("I have generated a number between 1 and " + maxRange + ". Can you guess it?");
            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the number correctly.");
                    guessedCorrectly = true;
                    userScore++;
                } else if (userGuess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }

                if (attempts == maxAttempts && !guessedCorrectly) {
                    System.out.println("Sorry, you've reached the maximum number of attempts. The number was " + randomNumber);
                }
            }
            System.out.print("Do you want to play another round? (yes/no): ");
            scanner.nextLine(); 
            String playAgainResponse = scanner.nextLine().trim().toLowerCase();
            playAgain = playAgainResponse.equals("yes");
        }
        System.out.println("Your total score is: " + userScore);
        System.out.println("Thank you for playing the Number Guessing Game!");
    }
}
