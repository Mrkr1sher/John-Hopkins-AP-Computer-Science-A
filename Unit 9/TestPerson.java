/**
 * This program tests the Person class for a person named Tony Baggadonuts,
 * whose birthdate is 10/21/2001.
 * 
 * @author Krish Thawani
 * 
 *         Unit 9 Lab 1
 */

public class TestPerson {
    public static void main(String[] args) {

        String firstName = "Tony";
        String lastName = "Baggadonuts";
        int birthDay = 21;
        int birthMonth = 10;
        int birthYear = 2001;

        Date date = new Date(birthDay, birthMonth, birthYear);
        Person person = new Person(firstName, lastName, date);

        System.out.println("Name: " + person.getFullName());
        System.out.println("Birthday: " + person.getBirthDayString());

    }
}