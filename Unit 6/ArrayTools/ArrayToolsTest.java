
/**
 * This program tests the methods defined in ArrayTools
 * 
 * @author Krish Thawani
 *
 */

import java.util.Arrays;

public class ArrayToolsTest {
    public static void main(String[] args) {

        // Testing Data Sets
        char charArray[] = { 'b', 'e', 'G', 'x', 'Z', 'k', 'P' };
        int intArray[] = { 5, 6, 2, 3, 19, 31, 4 };
        double doubleArray[] = { 5.6, 2.3, 19.31, 4.5, 6.2, 3.19, 31.4 };

        System.out.println("\n" + "Char Data Set: " + Arrays.toString(charArray));

        System.out.println("Minimum: " + ArrayTools.minimum(charArray));
        System.out.println("Minimum Index: " + ArrayTools.minimumAt(charArray));
        System.out.println("Maximum: " + ArrayTools.maximum(charArray));
        System.out.println("Maximum Index: " + ArrayTools.maximumAt(charArray));

        System.out.println("\n" + "Integer Minimum Data Set: " + Arrays.toString(intArray));

        System.out.println("Minimum: " + ArrayTools.minimum(intArray));
        System.out.println("Minimum Index: " + ArrayTools.minimumAt(intArray));
        System.out.println("Maximum: " + ArrayTools.maximum(intArray));
        System.out.println("Maximum Index: " + ArrayTools.maximumAt(intArray));
        System.out.printf("Average: %,.2f\n", ArrayTools.average(intArray));

        System.out.println("\n" + "Double Minimum Data Set: " + Arrays.toString(doubleArray));

        System.out.println("Minimum: " + ArrayTools.minimum(doubleArray));
        System.out.println("Minimum Index: " + ArrayTools.minimumAt(doubleArray));
        System.out.println("Maximum: " + ArrayTools.maximum(doubleArray));
        System.out.println("Maximum Index: " + ArrayTools.maximumAt(doubleArray));
        System.out.printf("Average: %,.2f\n", ArrayTools.average(doubleArray));

    }
}