/**
* This program uses a LinkedList to model a print queue and prompts the user to add jobs with randomized print times.
*
* @author Krish Thawani
 */

import java.util.*;
public class Unit12Lab2 {
    public static void main(String[] args) {

        System.out.println("\n");

        Random rnGenerator = new Random(1234567890);
        Scanner input = new Scanner(System.in);

        LinkedList<Job> queue = new LinkedList<Job>();

        int jobNumber = 0;
        char answer;
        int printTime;

        do {
            System.out.print("What would you like to do? ('a' to add job; type any other key to quit) --> ");
            answer = input.nextLine().toLowerCase().charAt(0);

            if (answer == 'a') {
                printTime = rnGenerator.nextInt(1000) + 10;
                jobNumber++;
                queue.add(new Job(jobNumber, printTime));
                System.out.println("Job Added." + "\n");
            }
            
        } while (answer == 'a');

        System.out.println("\n" + "Jobs:" + "\n");

        for (Job job : queue)
            System.out.print(job.getJob());
        
        System.out.println("\n");
    }
}