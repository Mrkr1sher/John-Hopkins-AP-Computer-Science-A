
/**
 * This program displays a calendar for a month and year that the user chooses
 * 
 * @author Krish Thawani
 *
 */
import java.util.Scanner;

public class Unit5Lab2 {
    public static void main(String[] args) {
        System.out.println("\n\n");
        Scanner input = new Scanner(System.in);

        int year, month;

        System.out.print("Enter a year -> ");
        year = input.nextInt();

        System.out.print("Enter a month (1-12) -> ");
        month = input.nextInt();

        printMonthCalendar(month, year);

        System.out.println("\n\n");

    }

    public static void printMonthCalendar(int m, int y) {
        printMonthHeader(m, y);
        printMonthBody(m, y);
    }

    public static void printMonthHeader(int m, int y) {

        System.out.println("\n\n\t\t" + getMonthName(m) + "  " + y);
        System.out.println("-----------------------------------------");
        System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");

    }

    public static void printMonthBody(int m, int y) {
        for (int i = 1; i <= getStartDay(m, 1, y); i++)
            System.out.print("      ");

        for (int i = 1; i <= getNumDaysInMonth(m, y); i++) {
            System.out.printf("%2d    ", i);
            if (((i + getStartDay(m, 1, y)) % 7 == 0) || (i == getNumDaysInMonth(m, y)))
                System.out.println("   ");
        }

    }

    public static String getMonthName(int m) {
        switch (m) {
        case 1:
            return "January";
        case 2:
            return "February";
        case 3:
            return "March";
        case 4:
            return "April";
        case 5:
            return "May";
        case 6:
            return "June";
        case 7:
            return "July";
        case 8:
            return "August";
        case 9:
            return "September";
        case 10:
            return "October";
        case 11:
            return "November";
        case 12:
            return "December";
        default:
            return "Invalid Month";
        }
    }

    public static int getStartDay(int m, int d, int y) {
        // Adjust month number & year to fit Zeller's numbering system
        if (m < 3) {
            m = m + 12;
            y = y - 1;
        }

        int k = y % 100; // Calculate year within century
        int j = y / 100; // Calculate century term
        int h = 0; // Day number of first day in month 'm'

        h = (d + (13 * (m + 1) / 5) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        // Convert Zeller's value to ISO value (1 = Mon, ... , 7 = Sun )
        int dayNum = ((h + 5) % 7) + 1;

        return dayNum;
    }

    public static int getNumDaysInMonth(int m, int y) {

        switch (m) {
        case 1:
            return 31;
        case 2:
            if (isLeapYear(y))
                return 29;
            else
                return 28;
        case 3:
            return 31;
        case 4:
            return 30;
        case 5:
            return 31;
        case 6:
            return 30;
        case 7:
            return 31;
        case 8:
            return 31;
        case 9:
            return 30;
        case 10:
            return 31;
        case 11:
            return 30;
        case 12:
            return 31;
        default:
            return 0;

        }
    }

    public static boolean isLeapYear(int y) {

        if (y % 4 == 0)
            return true;
        else
            return false;
    }
}