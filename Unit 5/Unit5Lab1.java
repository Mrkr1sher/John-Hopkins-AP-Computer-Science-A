
/**
 * This program asks the user for a financial function they'd like to use and then performs calculations based on their response
 * 
 * @author Krish Thawani
 *
 */
import java.util.Scanner;

public class Unit5Lab1 {
    public static void main(String[] args) {
        System.out.println("\n\n");

        Scanner input = new Scanner(System.in);

        int function, years, n;
        double interestRate, i;

        System.out.println("1. Future Value of a Single Sum");
        System.out.println("2. Present Value of a Single Sum");
        System.out.println("3. Future Value of an Annuity");

        System.out.print("\n" + "Enter the financial function you would like to use (1, 2, or 3) -> ");
        function = input.nextInt();

        System.out.print("\n" + "Enter the yearly interest rate (in percent) -> ");
        interestRate = input.nextDouble();
        i = (interestRate / 100) / 12;

        System.out.print("\n" + "Enter the number of years -> ");
        years = input.nextInt();
        n = years * 12;

        if (function == 1) { // Future Value Of Single Sum
            System.out.println("\n" + "Future Value of a Single Sum");

            System.out.print("Enter the amount of $ you are depositing -> ");
            double p = input.nextDouble();
            System.out.printf("You will have about $%,.2f in %d years", futureValueSingleSum(n, i, p), years);

        } else if (function == 2) { // Present Value Of Single Sum
            System.out.println("\n" + "Present Value of a Single Sum");

            System.out.print("Enter the amount of $ you want in " + years + "years -> ");
            double f = input.nextDouble();
            System.out.printf("You will need to deposit $%,.2f today.", presentValueSingleSum(n, i, f));

        } else if (function == 3) { // Future Value of Annuity
            System.out.println("\n" + "Future Value of an Annuity");

            System.out.print("Enter the $ of monthly deposits you are making -> ");
            double p = input.nextDouble();
            System.out.printf("You will have about $%,.2f in %d years", futureValueAnnuity(n, i, p), years);

        } else { // Invalid Option
            System.out.println("This is not a valid option. Please choose 1, 2, or 3.");
        }

        System.out.println("\n\n");
    }

    public static double futureValueSingleSum(int n, double i, double p) {
        double f = p * Math.pow((1 + i), n);
        return f;
    }

    public static double presentValueSingleSum(int n, double i, double f) {
        double p = f / (Math.pow((1 + i), n));
        return p;
    }

    public static double futureValueAnnuity(int n, double i, double a) {
        double f = a * ((Math.pow((1 + i), n)) - 1) / i;
        return f;
    }
}