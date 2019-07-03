
/**
 * This program tests the methods defined in ArrayTools2
 * 
 * @author Krish Thawani
 * Unit 6 Lab 3
 *
 */

import java.util.Arrays;

public class ArrayToolsTest2 {
        public static void main(String[] args) {

                // Testing Data Sets
                char charArray1[] = { 'b', 'e', 'G', 'x', 'Z', 'k', 'P' };
                char charArray2[] = { 'b', 'e', 'G', 'x', 'Z', 'k', 'P' };
                int intArray1[] = { 5, 6, 2, 3, 19, 31, 4 };
                int intArray2[] = { 6, 5, 2, 3, 19, 31, 4 };
                double doubleArray1[] = { 5.6, 2.3, 19.31, 4.5, 6.2, 3.19, 31.4 };
                double doubleArray2[] = { 5.6, 2.3, 19.31, 4.5, 6.2, 3.19, 31.4 };

                char charKey = 'x';
                int intKey = 31;
                double doubleKey = 2.3;

                System.out.println(Arrays.toString(charArray1) + " and " + Arrays.toString(charArray2) + " are equal: "
                                + ArrayTools2.equals(charArray1, charArray2));

                System.out.println(Arrays.toString(intArray1) + " and " + Arrays.toString(intArray2) + " are equal: "
                                + ArrayTools2.equals(intArray1, intArray2));

                System.out.println(Arrays.toString(doubleArray1) + " and " + Arrays.toString(doubleArray2)
                                + " are equal: " + ArrayTools2.equals(doubleArray1, doubleArray2));

                System.out.println(charKey + " is at index " + ArrayTools2.find(charArray1, charKey) + " of the array "
                                + Arrays.toString(charArray1));

                System.out.println(intKey + " is at index " + ArrayTools2.find(intArray1, intKey) + " of the array "
                                + Arrays.toString(intArray1));

                System.out.println(doubleKey + " is at index " + ArrayTools2.find(doubleArray1, doubleKey)
                                + " of the array " + Arrays.toString(doubleArray1));

                System.out.print(Arrays.toString(charArray1) + " sorted is ");
                ArrayTools2.sort(charArray1);
                System.out.println(Arrays.toString(charArray1));

                System.out.print(Arrays.toString(intArray1) + " sorted is ");
                ArrayTools2.sort(intArray1);
                System.out.println(Arrays.toString(intArray1));

                System.out.print(Arrays.toString(doubleArray1) + " sorted is ");
                ArrayTools2.sort(doubleArray1);
                System.out.println(Arrays.toString(doubleArray1));
        }
}