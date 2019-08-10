public class ArrayIndexOutOfBoundsExceptionCatch {
    public static void main(String[] args) {
        try {
            System.out.println();
            int[] array = {1, 3, 5, 7, 9, 11};
            System.out.println(array[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Caught");
            e.printStackTrace();
        }
        System.out.println("\n" + "Main Method Completed" + "\n");

    }
}