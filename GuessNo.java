import java.util.Scanner;
import java.util.Random;

public class GuessNo {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int numberToGuess = rand.nextInt(100) + 1;
        int userGuess;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");

        do {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            attempts++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("yay...correct! You guessed it in " + attempts + " attempts.");
            }

        } while (userGuess != numberToGuess);

    }
}
