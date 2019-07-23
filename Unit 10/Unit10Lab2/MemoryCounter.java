/**
 * This class models a memory counter
 * 
 * Unit 10 Lab 2
 * 
 * @author Krish Thawani
 */

public class MemoryCounter extends Counter {
    private int memoryCount;

    public void addMemory() {
        memoryCount += getCount();
    }

    public void resetMemory() {
        memoryCount = 0;
    }

    public int getMemory() {
        return memoryCount;
    }

}