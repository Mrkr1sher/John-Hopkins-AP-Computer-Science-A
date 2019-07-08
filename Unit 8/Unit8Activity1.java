/**
 * This program tests the expanded Cat class
 * 
 * @author Krish Thawani
 */
public class Unit8Activity1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        System.out.println("\n");

        cat1.setName("Koda");
        cat1.setBreed("Persian Cat");
        cat1.setSex('M');
        cat1.setWeight(23.4);
        cat1.setAge(7);

        cat2.setName("Teddy");
        cat2.setBreed("British Shorthair");
        cat2.setSex('F');
        cat2.setWeight(21.5);
        cat2.setAge(5);

        System.out.println("Cat 1:");
        System.out.println("Name: " + cat1.getName());
        System.out.println("Breed: " + cat1.getBreed());
        System.out.println("Sex: " + cat1.getSex());
        System.out.println("Weight: " + cat1.getWeight());
        System.out.println("Age: " + cat1.getAge());
        System.out.println();
        System.out.println("Cat 2:");
        System.out.println("Name: " + cat2.getName());
        System.out.println("Breed: " + cat2.getBreed());
        System.out.println("Sex: " + cat2.getSex());
        System.out.println("Weight: " + cat2.getWeight());
        System.out.println("Age: " + cat2.getAge());

        System.out.println("\n" + "After Change: ");
        cat1.setName("Adok");
        cat1.setAge(4);
        cat2.setAge(3);
        cat2.setWeight(22.7);
        System.out.println("Cat 1: ");
        System.out.println("Name: " + cat1.getName());
        System.out.println("Age: " + cat1.getAge());
        System.out.println();
        System.out.println("Cat 2: ");
        System.out.println("Age: " + cat2.getAge());
        System.out.println("Weight: " + cat2.getWeight());
        System.out.println(cat2.meow());

        System.out.println("\n");
    }
}