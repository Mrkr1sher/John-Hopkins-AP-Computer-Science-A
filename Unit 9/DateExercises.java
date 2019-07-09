
/**
 * This program tests the methods in the Date class
 * 
 * @author Krish Thawani
 * 
 *         Unit 9 Activity 1
 */
import javax.swing.JOptionPane;

public class DateExercises {
    public static void main(String[] args) {

        Date date = new Date();

        date.setDay(Input.getInt("Enter the day"));
        date.setMonth(Input.getInt("Enter the month"));
        date.setYear(Input.getInt("Enter the year"));
        JOptionPane.showMessageDialog(null, "The date is " + date.getDate());

    }
}