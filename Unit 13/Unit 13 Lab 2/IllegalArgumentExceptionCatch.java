import java.util.Random;
public class IllegalArgumentExceptionCatch {
    public static void main(String[] args) {

        try {
            Random randy = new Random();
            System.out.println();
            System.out.println(randy.nextInt(-5));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception Caught");
            e.printStackTrace();
        }
        System.out.println("\n" + "Main Method Completed" + "\n");

    }
}