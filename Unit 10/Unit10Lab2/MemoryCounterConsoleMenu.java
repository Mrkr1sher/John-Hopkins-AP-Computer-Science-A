
/**
 * This class models the memory console menu for the memory counter
 * 
 * Unit 10 Lab 2
 * 
 * @author Krish Thawani
 */

public class MemoryCounterConsoleMenu extends CounterConsoleMenu {

    MemoryCounter mem;

    public MemoryCounterConsoleMenu() {
        super();
        mem = new MemoryCounter();
    }

    public MemoryCounterConsoleMenu(MemoryCounter counter) {
        super();
        mem = counter;
    }

    @Override
    public void displayMenu() {
        super.displayMenu();
        System.out.println("5. Add to memory count\n" + "6. Reset memory count");
    }

    @Override
    public void displayCount() {
        System.out.println("Count: " + mem.getCount());
        System.out.println("Memory: " + mem.getMemory());
    }

    @Override
    public void readInput(int input) {
        switch (input) {
        case 1:
            mem.increment();
            break;
        case 2:
            mem.decrement();
            break;
        case 3:
            mem.reset();
            break;
        case 4:
            setPlay(false);
            break;
        case 5:
            mem.addMemory();
            break;
        case 6:
            mem.resetMemory();
            break;
        default:
            throw new IllegalArgumentException("Invalid Choice");
        }
    }
}