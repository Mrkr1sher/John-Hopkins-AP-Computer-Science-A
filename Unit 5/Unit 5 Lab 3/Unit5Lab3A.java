
/**
 * This program finds the minimum and maximum of three different data sets of
 * three values each
 * 
 * @author Krish Thawani
 *
 */

public class Unit5Lab3A {
    public static void main(String[] args) {

        System.out.println("\n\n");

        for (int i = 1; i <= 3; i++) {
            double a = (Math.random() + (int) (Math.random() * 10));
            double b = (Math.random() + (int) (Math.random() * 10));
            double c = (Math.random() + (int) (Math.random() * 10));
            System.out.println("\n" + "Data Set " + i + ": " + a + ", " + b + ", " + c);
            System.out.println("Minimum: " + min(a, b, c));
            System.out.println("Maximum: " + max(a, b, c));
        }

        System.out.println("\n\n");
    }

    public static double min(double a, double b, double c) {
        return Math.min(Math.min(a, b), c);

    }

    public static double max(double a, double b, double c) {
        return Math.max(Math.max(a, b), c);
    }
}