public class Person {
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private Date birthDate;

    // Constructors
    public Person() {
        name = "No Name";
        address = "No Address";
        email = "No Email";
        phoneNumber = "No Phone Number";
        birthDate = new Date();
    }

    public Person(String name, String address, String email, String phoneNumber, Date birthDate) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
    }

    // Mutators
    public void setName(String s) {
        name = s;
    }

    public void setAddress(String s) {
        address = s;
    }

    public void setEmail(String s) {
        email = s;
    }

    public void setPhoneNumber(String s) {
        phoneNumber = s;
    }

    public void setBirthDate(Date s) {
        birthDate = s;
    }

    // Accessors
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%n", this.getClass().getName(), this.getName());
    }

}