/**
 * This program tests the Animal and Vehicle classes by calling the methods they
 * implement
 * 
 * @author Krish Thawani
 */
public class ManipulateAnimals {
    public static void main(String[] args) {

        System.out.println("\n");

        Animal[] objects = { new Animal(), new Animal(), new Vehicle(), new Vehicle() };

        for (int i = 0; i < objects.length; i++) {
            objects[i].drawObject();
            objects[i].rotateObject();
            objects[i].resizeObject();
            objects[i].playSound();
        }

        System.out.println("\n");

    }
}