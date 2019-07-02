
/**
 * This program tells the user the occurrence of each number in a set of integers that the user entered
 * 
 * @author Krish Thawani
 *
 */
import java.util.Scanner;

public class Unit6Lab1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numbers[];
        int size;

        System.out.print("\n" + "How many integers will be entered? --> ");
        size = input.nextInt();
        numbers = new int[size];
        System.out.println("Enter " + size + " integers below (1-50)");
        for (int i = 0; i < size; i++)
            numbers[i] = input.nextInt();
        for (int n = 1; n <= 50; n++) {
            int occurrence = 0;
            for (int j = 0; j < size; j++)
                if (numbers[j] == n)
                    occurrence++;
            if (occurrence > 1) {
                System.out.println(n + " occurs " + occurrence + " times.");
            } else if (occurrence == 1) {
                System.out.println(n + " occurs " + occurrence + " time.");
            }
        }
    }
}