public class NullPointerExceptionCatch {
    public static void main(String[] args) {
        try {

            System.out.println();
            int[] array = null;
            System.out.println(array.length);
       
        } catch (NullPointerException e) {
            System.out.println("Exception Caught");
            e.printStackTrace();
        }

        System.out.println("\n" + "Main Method Completed" + "\n");
    }
}