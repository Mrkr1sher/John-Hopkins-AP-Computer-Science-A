/**
 * This program tests the MemoryCounter and MemoryCounterConsoleMenu classes to
 * display a memory counter to the user
 * 
 * Unit 10 Lab 2
 * 
 * @author Krish Thawani
 */
public class MemoryCounterTest {
    public static void main(String[] args) {

        MemoryCounterConsoleMenu console = new MemoryCounterConsoleMenu();

        System.out.println("\n");

        while (console.userWantsToPlay()) {
            console.getInput();
            console.displayCount();
        }

        System.out.println("\n");
    }
}