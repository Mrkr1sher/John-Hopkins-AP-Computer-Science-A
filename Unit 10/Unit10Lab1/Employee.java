public class Employee extends Person {
    private double salary;
    private Date hireDate;

    public Employee() {
        super();
        salary = 0;
        hireDate = new Date();
    }

    public Employee(String name, String address, String email, String phoneNumber, Date birthDate, double salary,
            Date hireDate) {
        super(name, address, email, phoneNumber, birthDate);
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public void setSalary(double s) {
        salary = s;
    }

    public void setHireDate(Date s) {
        hireDate = s;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%n", "Employee", super.getName());
    }

}