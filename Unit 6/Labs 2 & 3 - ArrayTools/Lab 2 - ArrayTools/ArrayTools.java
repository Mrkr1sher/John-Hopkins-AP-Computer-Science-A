
/**
 * This class uses overloaded methods to find the minimum and maximum and their
 * indexes in an array
 * 
 * @author Krish Thawani
 * 
 *         Unit 6 Lab 2
 */

public class ArrayTools {

    public static char minimum(char array[]) {
        char minimum = array[0];

        for (char num : array)
            if (num < minimum)
                minimum = num;
        return minimum;

    }

    public static int minimum(int array[]) {
        int minimum = array[0];

        for (int num : array)
            if (num < minimum)
                minimum = num;
        return minimum;
    }

    public static double minimum(double array[]) {
        double minimum = array[0];

        for (double num : array)
            if (num < minimum)
                minimum = num;
        return minimum;
    }

    public static char maximum(char array[]) {
        char minimum = array[0];

        for (char num : array)
            if (num < minimum)
                minimum = num;
        return minimum;
    }

    public static int maximum(int array[]) {
        int minimum = array[0];

        for (int num : array)
            if (num > minimum)
                minimum = num;
        return minimum;
    }

    public static double maximum(double array[]) {
        double minimum = array[0];

        for (double num : array)
            if (num > minimum)
                minimum = num;
        return minimum;
    }

    public static int minimumAt(char array[]) {
        char minimum = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++)
            if (array[i] < minimum) {
                minimum = array[i];
                index = i;
            }
        return index;
    }

    public static int minimumAt(int array[]) {
        int minimum = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++)
            if (array[i] < minimum) {
                minimum = array[i];
                index = i;
            }
        return index;
    }

    public static int minimumAt(double array[]) {
        double minimum = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++)
            if (array[i] < minimum) {
                minimum = array[i];
                index = i;
            }
        return index;
    }

    public static int maximumAt(char array[]) {
        char minimum = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++)
            if (array[i] > minimum) {
                minimum = array[i];
                index = i;
            }
        return index;
    }

    public static int maximumAt(int array[]) {
        int minimum = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++)
            if (array[i] > minimum) {
                minimum = array[i];
                index = i;
            }
        return index;
    }

    public static int maximumAt(double array[]) {
        double minimum = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++)
            if (array[i] > minimum) {
                minimum = array[i];
                index = i;
            }
        return index;
    }

    public static double average(int array[]) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double average(double array[]) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }
}