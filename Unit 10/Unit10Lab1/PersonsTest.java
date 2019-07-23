/**
 * This program tests the inheritance of the Person, Student, Employee, Faculty,
 * and Staff classes
 * 
 * Unit 10 Lab 1
 * 
 * @author Krish Thawani
 */

public class PersonsTest {
    public static void main(String[] args) {
        Date date = new Date(6, 4, 2004);
        Date hireDate = new Date(3, 2, 1002);

        Person person = new Person("Bob Kazamakis", "1725 Slough Avenue", "bobkaz@gmail.com", "888-999-0000", date);
        Student student = new Student("Billy Bob Boe", "30 Road Drive", "billybobboe@gmail.com", "444-555-6666", date,
                "Sophomore");
        Employee employee = new Employee("Dwight Schrute", "6 Schrute Farms", "dwightschrute@gmail.com", "111-222-3333",
                date, 85000.50, hireDate);
        Staff staff = new Staff("Jim Halpert", "123 Maple Street", "jimmyhalpert@gmail.com", "123-456-7890", date,
                85000.25, hireDate, "Salesman");
        Faculty faculty = new Faculty("Pam Halpert", "123 Maple Street", "pamelahalpert@gmail.com", "0978-654-321",
                date, 65000.50, hireDate, "9:00AM - 5:00PM", "Art Professor");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(staff);
        System.out.println(faculty);
    }
}