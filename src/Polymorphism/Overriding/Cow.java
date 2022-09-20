package Polymorphism.Overriding;

/**
 * @author Ryan Taylor
 * @created 20/09/2022 - 00:51
 */
public class Cow extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The cow goes moo.");
    }
}
