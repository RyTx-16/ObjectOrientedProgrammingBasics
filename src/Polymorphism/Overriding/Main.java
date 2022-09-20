package Polymorphism.Overriding;

/**
 * @author Ryan Taylor
 * @created 20/09/2022 - 00:53
 */
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myCat = new Cat();
        Animal myCow = new Cow();

        myAnimal.animalSound();
        myCat.animalSound();
        myCow.animalSound();
    }
}
