/**
 * This class stores a date based on day, month, and year.
 * 
 * @author Krish Thawani
 * 
 * 
 */

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int d, int m, int y) {
        if (d > 0 && d < 31)
            day = d;
        else
            throw new IllegalArgumentException("Invalid Day");
        if (m > 0 && m < 12)
            month = m;
        else
            throw new IllegalArgumentException("Invalid Month");
        year = y;
    }

    public void setDay(int d) {
        if (d > 0 && d < 31)
            day = d;
        else
            throw new IllegalArgumentException("Invalid Day");

    }

    public void setMonth(int m) {
        if (m > 0 && m < 12)
            month = m;
        else
            throw new IllegalArgumentException("Invalid Month");
    }

    public void setYear(int y) {
        year = y;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getDate() {
        return month + "/" + day + "/" + year;
    }

}