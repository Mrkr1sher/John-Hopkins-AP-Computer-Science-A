
/**
 * This program prompts the user to enter a monetary amount and displays the monetary equivalent in dollars, quarters, dimes, nickels, and pennies
 * 
 * @author Krish Thawani
 *
 */
import java.util.Scanner;

public class Unit2Lab2 {
    public static void main(String[] args) {
        System.out.println("\n\n");
        Scanner scanner = new Scanner(System.in);
        double originalAmount;
        int cents, dollars, quarters, dimes, nickels, pennies;
        System.out.print("Enter a monetary amount (dollars and cents) -->  $");
        originalAmount = scanner.nextDouble();

        dollars = (int) originalAmount;

        cents = (int) Math.round((originalAmount - dollars) * 100);

        quarters = cents / 25;
        cents -= quarters * 25;

        dimes = cents / 10;
        cents -= dimes * 10;

        nickels = cents / 5;
        cents -= nickels * 5;

        pennies = cents;

        System.out.println("\n$" + originalAmount + " consists of " + dollars + " dollars, " + quarters + " quarters, "
                + dimes + " dimes, " + nickels + " nickels, " + pennies + " pennies.");
        System.out.println("\n\n");
    }

}