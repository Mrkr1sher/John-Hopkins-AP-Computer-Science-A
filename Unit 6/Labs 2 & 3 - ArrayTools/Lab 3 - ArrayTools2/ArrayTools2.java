
/**
 * This class uses overloaded methods to performs different operations on arrays
 * 
 * @author Krish Thawani
 * 
 *         Unit 6 Lab 3
 */

import java.util.Arrays;

public class ArrayTools2 {

    public static boolean equals(char a1[], char a2[]) {
        return Arrays.equals(a1, a2);
    }

    public static boolean equals(int a1[], int a2[]) {
        return Arrays.equals(a1, a2);
    }

    public static boolean equals(double a1[], double a2[]) {
        return Arrays.equals(a1, a2);
    }

    public static int find(char array[], char key) {
        return Arrays.binarySearch(array, key);
    }

    public static int find(int array[], int key) {
        return Arrays.binarySearch(array, key);
    }

    public static int find(double array[], double key) {
        return Arrays.binarySearch(array, key);
    }

    public static void sort(char array[]) {
        Arrays.sort(array);
    }

    public static void sort(int array[]) {
        Arrays.sort(array);
    }

    public static void sort(double array[]) {
        Arrays.sort(array);
    }

}