
/**
 * This program generates a sequence of 100 random numbers from a set
 * 
 * @author Krish Thawani
 * 
 *
 */
import java.util.Random;

public class Unit5Activity1_4 {
    public static void main(String[] args) {

        Random random = new Random();

        int set[] = { 6, 10, 14, 18, 22 };

        int randomNum, numSix = 0, numTen = 0, numFourteen = 0, numEighteen = 0, numTwentyTwo = 0;

        for (int i = 0; i < 100; i++) {
            randomNum = set[random.nextInt(set.length)];
            switch (randomNum) {
            case 6:
                numSix++;
                break;
            case 10:
                numTen++;
                break;
            case 14:
                numFourteen++;
                break;
            case 18:
                numEighteen++;
                break;
            case 22:
                numTwentyTwo++;
            }
        }

        System.out.println("Number Of 6's: " + numSix);
        System.out.println("Number Of 10's: " + numTen);
        System.out.println("Number Of 14's: " + numFourteen);
        System.out.println("Number Of 18's: " + numEighteen);
        System.out.println("Number Of 22's: " + numTwentyTwo);
    }
}