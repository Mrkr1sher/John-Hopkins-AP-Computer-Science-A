
/**
 * This class tests the rectangle class' methods.
 * 
 * @author Krish Thawani
 * 
 * Unit 8 Lab 1
 */
import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {

        System.out.println("\n");

        Scanner input = new Scanner(System.in);
        Rectangle rect = new Rectangle();

        char symbol;

        System.out.print("Enter the length of the rectangle --> ");
        rect.setLength(input.nextInt());
        System.out.print("Enter the width of the rectangle --> ");
        rect.setWidth(input.nextInt());

        input.nextLine();

        System.out.print("Enter a symbol to draw the rectangle --> ");
        symbol = input.nextLine().charAt(0);

        System.out.println("\n");
        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
        System.out.println();
        rect.drawRectangle(symbol);
        System.out.println("\n");
    }
}