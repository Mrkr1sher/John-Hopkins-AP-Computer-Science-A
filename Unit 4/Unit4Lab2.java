
/**
 * This program displays an output of asterisks based on a number the user enters. 
 * 
 * @author Krish Thawani
 *
 */
import java.util.Scanner;

public class Unit4Lab2 {
    public static void main(String[] args) {

        System.out.println("\n\n");
        Scanner input = new Scanner(System.in);

        int numAsterisks;

        System.out.print("Enter the maximum number of asterisks to display --> ");
        numAsterisks = input.nextInt();

        System.out.println();

        for (int i = numAsterisks; i > 0; i--) {
            for (int n = 0; n < i; n++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\n");
    }
}