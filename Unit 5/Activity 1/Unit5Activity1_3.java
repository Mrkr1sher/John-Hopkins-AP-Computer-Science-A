
/**
 * This program generates a sequence of 20 random numbers between 1 and 5
 * 
 * @author Krish Thawani
 * 
 *
 */
public class Unit5Activity1_3 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++)
            System.out.println((int) (Math.random() * 5) + 1);
    }
}

/*
 * 3a. No, the same sequences were not generated each time.
 * 
 * 3b. The Java random method selects a random number and it is very unlikely to
 * have the same sequences of numbers each time.
 */
