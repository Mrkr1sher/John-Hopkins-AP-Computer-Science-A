
/**
 * This program finds the minimum, maximum, average, and letter score of three 
 * different students' test scores
 * 
 * @author Krish Thawani
 *
 */
import java.util.Scanner;

public class Unit5Lab3B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double test1, test2, test3, test4;

        for (int i = 1; i <= 3; i++) {

            System.out.println("\n\n" + "Student " + i);
            System.out.println("---------\n");

            System.out.print("Enter score for test #1 --> ");
            test1 = input.nextDouble();

            System.out.print("Enter score for test #2 --> ");
            test2 = input.nextDouble();

            System.out.print("Enter score for test #3 --> ");
            test3 = input.nextDouble();

            System.out.print("Enter score for test #4 --> ");
            test4 = input.nextDouble();

            System.out.printf("\n\n" + "Minimum Test Score: %.2f%%\n", min(test1, test2, test3, test4));
            System.out.printf("Maximum Test Score: %.2f%%\n", max(test1, test2, test3, test4));
            System.out.printf("Average Test Score: %.2f%%\n", average(test1, test2, test3, test4));
            System.out.println("Letter Grade: " + letterGrade(average(test1, test2, test3, test4)));

        }

        System.out.println("\n\n");
    }

    public static double min(double a, double b, double c, double d) {
        return Math.min(Math.min(Math.min(a, b), c), d);

    }

    public static double max(double a, double b, double c, double d) {
        return Math.max(Math.max(Math.max(a, b), c), d);
    }

    public static double average(double a, double b, double c, double d) {
        return (a + b + c + d) / 4.0;
    }

    public static char letterGrade(double average) {
        average = Math.ceil(average);

        if (average >= 90)
            return 'A';
        else if (average >= 80)
            return 'B';
        else if (average >= 70)
            return 'C';
        else if (average >= 65)
            return 'D';
        else
            return 'F';

    }
}