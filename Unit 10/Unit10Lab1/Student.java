public class Student extends Person {

    private String classStatus;

    public Student() {
        super();
        classStatus = "No Class Status";
    }

    public Student(String name, String address, String email, String phoneNumber, Date birthDate, String classStatus) {
        super(name, address, email, phoneNumber, birthDate);
        this.classStatus = classStatus;
    }

    public void setStatus(String s) {
        classStatus = s;
    }

    public String getStatus() {
        return classStatus;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%n", "Student", super.getName());
    }

}