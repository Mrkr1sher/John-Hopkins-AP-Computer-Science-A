/**
 * This program tests the Counter and CounterConsoleMenu classes to display a
 * counter to the user
 * 
 * Unit 9 Lab 2
 * 
 * @author Krish Thawani
 */
public class CounterTest {
    public static void main(String[] args) {

        CounterConsoleMenu console = new CounterConsoleMenu();

        System.out.println("\n");

        while (console.userWantsToPlay()) {
            console.getInput();
            console.displayCount();
        }

        System.out.println("\n");
    }
}