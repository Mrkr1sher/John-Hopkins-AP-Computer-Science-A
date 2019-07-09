/**
 * Person class to model a Person's information
 * 
 * @author Krish Thawani
 * 
 */

public class Person {
    private Name name;
    private Date birthDay;

    public String getFirstName() {
        return name.getFirstName();
    }

    public String getLastName() {
        return name.getLastName();
    }

    public String getFullName() {
        return name.getFullName();
    }

    public String getBirthDayString() {
        return birthDay.getDate();
    }

    public Person(String fn, String ln, Date bd) {
        name = new Name(fn, ln);
        birthDay = bd;
    }

    public Person(Name nm, Date bd) {
        name = nm;
        birthDay = bd;
    }

    public Person() {
        name = new Name();
        birthDay = new Date(99, 99, 9999);
    }
}