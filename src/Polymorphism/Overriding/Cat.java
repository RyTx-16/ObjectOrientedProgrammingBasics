package Polymorphism.Overriding;

/**
 * @author Ryan Taylor
 * @created 20/09/2022 - 00:52
 */
public class Cat extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The cat goes meow.");
    }
}
