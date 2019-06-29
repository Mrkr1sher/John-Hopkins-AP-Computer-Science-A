/**
 * This program quizzes the user on single-digit random multiplication problems
 * 
 * Unit 4 Activity 1
 * 
 * @author Krish Thawani
 *
 */

import java.util.Scanner;

public class MultiplicationQuiz {
    public static void main(String[] args) {
        System.out.println("\n\n");

        int numProblems, numCorrect = 0;
        Scanner input = new Scanner(System.in);

        // Prompt user to enter number of problems
        System.out.print("Enter how many problems to generate -> ");
        numProblems = input.nextInt();

        long start = System.currentTimeMillis();

        // Prompt user to input answer
        for (int i = 0; i < numProblems; i++) {

            // Generate 2 random numbers that will be multiplied
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            System.out.print("\n" + "What is " + number1 + " * " + number2 + "? ");
            int answer = input.nextInt();

            // Grade the answer
            if ((number1 * number2) == answer) {
                System.out.println("Congratulations...you are correct!");
                numCorrect++;
            } else
                System.out.println("Incorrect:  " + number1 + " * " + number2 + " = " + (number1 * number2));
        }
        long end = System.currentTimeMillis();

        int time = (int) ((end - start) / 1000);

        System.out.println("\n\n" + "You finished in " + time + " seconds.");
        System.out.println("You correctly answered " + numCorrect + " out of " + numProblems + " problems.");
        System.out.printf("Your score is %.2f%%.", (((double) numCorrect / numProblems) * 100));
        System.out.println("\n\n");
    }
}