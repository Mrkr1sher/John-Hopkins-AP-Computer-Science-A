
/**
 * This program uses a do while loop to determine the highest and lowest numbers that a user enters out of 10 numbers
 * 
 * @author Krish Thawani
 *
 */
import java.util.Scanner;

public class Unit4Lab3C {
    public static void main(String[] args) {

        System.out.println("\n\n");
        Scanner input = new Scanner(System.in);

        int counter = 1, lowest, highest, number;

        System.out.print("Enter the first integer --> ");
        number = input.nextInt();
        lowest = number;
        highest = number;

        System.out.println("Enter 9 more integers below");

        do {
            number = input.nextInt();
            if (number < lowest)
                lowest = number;
            else if (number > highest)
                highest = number;
            counter++;

        } while (counter < 10);

        System.out.println("\n" + "Lowest Number Entered: " + lowest);
        System.out.println("Highest Number Entered: " + highest);

        System.out.println("\n\n");
    }
}