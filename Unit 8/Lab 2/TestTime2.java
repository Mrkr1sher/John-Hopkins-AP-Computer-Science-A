/**
 * This program tests the modified Test2 class to make sure the display remains
 * the same for the client
 * 
 * @author Krish Thawani
 * 
 *         Unit 8 Lab 2
 */

public class TestTime2 {
    public static void main(String[] args) {
        System.out.println("\n");

        Time2 t1 = new Time2();
        Time2 t2 = new Time2(4);
        Time2 t3 = new Time2(4, 25);
        Time2 t4 = new Time2(4, 25, 38);
        Time2 t5 = new Time2(t4);

        display("Default: ", t1);
        display("Hour Specified: ", t2);
        display("Hour & Minute Specified: ", t3);
        display("Hour, Minute, & Second Specified: ", t4);
        display("Object of T4 (All 3 Specified): ", t5);
        System.out.println("\n");
    }

    public static void display(String text, Time2 t) {
        System.out.printf("%s%n %s%n %s%n", text, t.toUniversalString(), t.toString());
    }
}
