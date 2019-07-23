public class Faculty extends Employee {

    private String officeHours;
    private String rank;

    // Constructors
    public Faculty() {
        super();
        officeHours = "No Office Hours";
        rank = "No Rank";
    }

    public Faculty(String name, String address, String email, String phoneNumber, Date birthDate, double salary,
            Date hireDate, String officeHours, String rank) {
        super(name, address, email, phoneNumber, birthDate, salary, hireDate);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    // Mutators
    public void setOfficeHours(String s) {
        officeHours = s;
    }

    public void setRank(String s) {
        rank = s;
    }

    // Accessors
    public String getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%n", "Faculty", super.getName());
    }
}