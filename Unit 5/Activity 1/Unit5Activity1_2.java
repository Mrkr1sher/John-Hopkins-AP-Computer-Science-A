
/**
 * This class prompts the user for an angle in degrees and shows it in radians, sine, cosine, and tangent
 * 
 * @author Krish Thawani
 * 
 *
 */
import java.util.Scanner;

public class Unit5Activity1_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double degrees, radians;

        System.out.println("\n");
        System.out.print("Enter an angle (in degrees) --> ");
        degrees = input.nextDouble();

        System.out.println();
        System.out.println("Degrees: " + degrees);
        System.out.println("Radians: " + degrees * (Math.PI / 180));
        System.out.println("Sine: " + Math.sin(degrees));
        System.out.println("Cosine: " + Math.cos(degrees));
        System.out.println("Tangent: " + Math.tan(degrees));
        System.out.println("\n");
    }
}