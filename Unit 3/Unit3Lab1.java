
/**
 * This program prompts the user to enter the sides of a triangle and evaluates whether the triangle is isosceles, scalene, or equilateral
 * 
 * @author Krish Thawani
 *
 */
import java.util.Scanner;

public class Unit3Lab1 {
    public static void main(String[] args) {

        System.out.println("\n\n");

        int side1, side2, side3;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 3 sides of the triangle, separated by a space -->  ");
        side1 = scanner.nextInt();
        side2 = scanner.nextInt();
        side3 = scanner.nextInt();

        System.out.println("\n" + "Side 1: " + side1 + "\t" + "Side 2: " + side2 + "\t" + "Side 3: " + side3 + "\n");
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println(
                    "The values entered do not make a valid triangle. Side lengths must be greater than zero.");
        } else if ((side1 + side2 < side3) || (side1 + side3 < side2) || (side2 + side3 < side1)) {
            System.out.println("The values entered do not make a valid triangle.");
        } else {

            if (side1 == side2 && side1 == side3) {
                System.out.println("Equilateral Triangle");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        }

        System.out.println("\n\n");
    }

}