import java.util.Arrays;
import java.security.SecureRandom;
public class Unit16Lab2 {
    public static void main(String[] args) {

        SecureRandom generator = new SecureRandom();
        int[] data = generator.ints(20, 0 , 100).toArray();

        System.out.println("\n");
        
        System.out.println("Unsorted Data: " + Arrays.toString(data));
        System.out.println("Sorted Data: " + Arrays.toString((bubbleSort(data))));

        System.out.println("\n");
    }

    public static int[] bubbleSort(int[] array) {

        int temp;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}