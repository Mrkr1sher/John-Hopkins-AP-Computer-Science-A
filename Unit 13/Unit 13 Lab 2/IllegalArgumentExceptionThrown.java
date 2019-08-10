import java.util.Random;
public class IllegalArgumentExceptionThrown {
    public static void main(String[] args) {

        Random randy = new Random();
        System.out.println();
        System.out.println(randy.nextInt(-5));
        System.out.println("\n" + "Main Method Completed" + "\n");

    }
}