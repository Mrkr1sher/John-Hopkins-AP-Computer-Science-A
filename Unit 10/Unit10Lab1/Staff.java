public class Staff extends Employee {

    private String jobTitle;

    // Constructors

    public Staff() {
        super();
        jobTitle = "No Job Title";
    }

    public Staff(String name, String address, String email, String phoneNumber, Date birthDate, double salary,
            Date hireDate, String jobTitle) {
        super(name, address, email, phoneNumber, birthDate, salary, hireDate);
        this.jobTitle = jobTitle;
    }

    // Mutators
    public void setJobTitle(String s) {
        jobTitle = s;
    }

    // Accessors
    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%n", "Staff", super.getName());
    }
}