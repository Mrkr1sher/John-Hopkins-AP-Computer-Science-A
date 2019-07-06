
/**
 * This program rounds two numbers to integers, 1 decimal place, 2 decimal places, and 3 decimal places
 * 
 * @author Krish Thawani
 * 
 *
 */
import java.util.Scanner;

public class Unit5Activity1_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n\n");

        double x, y, quotient, oneDecimal, twoDecimal, threeDecimal;
        int integer;

        System.out.print("Enter two numbers: --> ");
        x = input.nextDouble();
        y = input.nextDouble();

        quotient = x / y;
        integer = (int) (Math.floor(quotient * Math.pow(10, 0) + 0.5) / Math.pow(10, 0));
        oneDecimal = Math.floor(quotient * Math.pow(10, 1) + 0.5) / Math.pow(10, 1);
        twoDecimal = Math.floor(quotient * Math.pow(10, 2) + 0.5) / Math.pow(10, 2);
        threeDecimal = Math.floor(quotient * Math.pow(10, 3) + 0.5) / Math.pow(10, 3);

        System.out.println("\n");
        System.out.println(x + " / " + y + " rounded to an integer is " + integer);
        System.out.println(x + " / " + y + " rounded to one decimal place is " + oneDecimal);
        System.out.println(x + " / " + y + " rounded to two decimal places is " + twoDecimal);
        System.out.println(x + " / " + y + " rounded to three decimal places is " + threeDecimal);

        System.out.println("\n\n");

    }
}