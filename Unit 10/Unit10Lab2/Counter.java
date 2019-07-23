/**
 * This class models a counter
 * 
 * Unit 10 Lab 2
 * 
 * @author Krish Thawani
 */

public class Counter {
    private int count;

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public void reset() {
        count = 0;
    }

    public int getCount() {
        return count;
    }
}