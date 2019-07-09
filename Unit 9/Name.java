/**
 * Name class to store a Person's name
 * 
 * @author Krish Thawani
 * 
 */

public class Name {
    private String firstName;
    private String lastName;

    public Name() {
        firstName = "None";
        lastName = "None";
    }

    public Name(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public void setFirstName(String s) {
        firstName = s;
    }

    public void setLastName(String s) {
        lastName = s;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}