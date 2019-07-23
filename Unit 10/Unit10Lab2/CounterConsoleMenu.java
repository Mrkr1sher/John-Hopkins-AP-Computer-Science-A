
/**
 * This class models the console menu for the counter
 * 
 * Unit 10 Lab 2
 * 
 * @author Krish Thawani
 */
import java.util.Scanner;

public class CounterConsoleMenu {

    private Scanner input;
    private Counter counter;
    private boolean play; // does the user want to keep playing? if false, quit program

    public CounterConsoleMenu() {
        input = new Scanner(System.in);
        counter = new Counter();
        play = true;
    }

    public CounterConsoleMenu(Counter counter) {
        input = new Scanner(System.in);
        this.counter = counter;
        play = true;
    }

    public void displayMenu() {
        System.out.println();
        System.out.println("1. Increment\n" + "2. Decrement\n" + "3. Reset\n" + "4. Quit");
    }

    public void getInput() {
        displayMenu();
        System.out.print("What would you like to do with the counter? --> ");
        readInput(input.nextInt());
    }

    public void displayCount() {
        System.out.println("Count: " + counter.getCount());
    }

    public boolean userWantsToPlay() {
        return play;
    }

    public void setPlay(boolean p) {
        play = p;
    }

    public void readInput(int input) {
        switch (input) {
        case 1:
            counter.increment();
            break;
        case 2:
            counter.decrement();
            break;
        case 3:
            counter.reset();
            break;
        case 4:
            setPlay(false);
            break;
        default:
            throw new IllegalArgumentException("Invalid Choice");
        }
    }

}