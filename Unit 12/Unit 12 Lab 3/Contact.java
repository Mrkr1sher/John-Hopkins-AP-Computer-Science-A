/**
* This class models a contact in a contact list
*
* @author Krish Thawani
 */

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;

    // Constructors
    public Contact() {
        firstName = "";
        lastName = "";
        phoneNumber = "";
        emailAddress = "";
    }
    public Contact(String firstName, String lastName, String phoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    public Contact(String[] contactInfo) {
        firstName = contactInfo[0];
        lastName = contactInfo[1];
        phoneNumber = contactInfo[2];
        emailAddress = contactInfo[3];
    }
    public Contact(String line) {
        this(line.split("\\s+")); // Call Constructor that takes String array
    }
    

    // Mutators
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    // Accessors
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public String getContact() {
        return String.format("%s      %s      %s      %s%n", firstName, lastName, phoneNumber, emailAddress);
    }

}