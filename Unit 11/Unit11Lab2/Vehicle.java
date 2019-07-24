/**
 * This class models a vehicle and realizes the Drawable, Rotatable, Resiable,
 * and Sounds interfaces.
 * 
 * Although in real life a vehicle is not an animal, in this case, a vehicle had
 * all the attributes and methods of an animal, and more.
 * 
 * @author Krish Thawani
 */

public class Vehicle extends Animal implements Drawable, Rotatable, Resizable, Sounds {

    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void drawObject() {
        System.out.println("Drawing a Vehicle");
    }

    public void rotateObject() {
        System.out.println("Rotating a Vehicle");
    }

    public void resizeObject() {
        System.out.println("Resizing a Vehicle");
    }

    public void playSound() {
        System.out.println("Vehicle Sound");
    }
}