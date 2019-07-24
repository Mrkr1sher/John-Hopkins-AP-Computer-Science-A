/**
 * This class models an animal and realizes the Drawable, Rotatable, Resiable,
 * and Sounds interfaces.
 * 
 * @author Krish Thawani
 */
public class Animal implements Drawable, Rotatable, Resizable, Sounds {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void drawObject() {
        System.out.println("Drawing an Animal");
    }

    public void rotateObject() {
        System.out.println("Rotating an Animal");
    }

    public void resizeObject() {
        System.out.println("Resizing an Animal");
    }

    public void playSound() {
        System.out.println("Animal Sound");
    }
}