/**
 * This program asks the user to guess a secret number between 1 and a number they enter
 * 
 * @author Krish Thawani
 *
 */
import java.util.Scanner;

public class Unit4Lab1 {
    public static void main(String[] args) {

        System.out.println("\n\n");
        Scanner input = new Scanner(System.in);

        char repeat;

        int numGuesses, n, userGuess, randomNum;

        do {

            System.out.print("\n" + "Enter a positive number -> ");
            n = input.nextInt();

            System.out.print("\n" + "Enter the amount of guesses you'd like -> ");
            numGuesses = input.nextInt();

            // Generate random number
            randomNum = (int) (n * Math.random()) + 1;

            System.out.println("Start guessing!");

            for (int i = 1; i <= numGuesses; i++) {

                userGuess = input.nextInt();

                if (userGuess == randomNum) {
                    System.out.println(
                            "Congratulations! You guessed it in " + i + " guesses. The number was: " + randomNum);
                    break;
                } else if (userGuess > randomNum)
                    System.out.println("Too high!");
                else if (userGuess < randomNum)
                    System.out.println("Too low!");

                if (i == numGuesses)
                    System.out.println("You failed! You're out of guesses! The random number was: " + randomNum);
            }

            // Prompt user to play again
            System.out.print("\n" + "Would you like to play again? (y/n) --> ");

            input.nextLine();

            repeat = (input.nextLine()).charAt(0);

        } while (repeat == 'y' || repeat == 'Y');
        System.out.println("\n\n");
    }
}