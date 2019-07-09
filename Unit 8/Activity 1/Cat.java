/**
 * This class expands the Cat class shown in the Object-Oriented Concepts
 * tutorial
 * 
 * @author Krish Thawani
 * 
 *         Unit 8 Activity 1
 */
public class Cat {
    private String breed;
    private int age;
    private double weight;
    private char sex;
    private String name;

    public void setBreed(String s) {
        breed = s;
    }

    public String getBreed() {
        return breed;
    }

    public void setAge(int s) {
        age = s;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(double s) {
        weight = s;
    }

    public double getWeight() {
        return weight;
    }

    public void setSex(char s) {
        sex = s;
    }

    public char getSex() {
        return sex;
    }

    public void setName(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }

    public String eat() {
        return "Munch Munch Munch";
    }

    public String meow() {
        return "Meeeeeooww";
    }
}