package Abstrction.Interface;

/**
 * @author Ryan Taylor
 * @created 20/09/2022 - 01:58
 */
public class Sheep implements Animal {
    @Override
    public void animalSound() {
        System.out.println("Sheep goes baaaaah");
    }

    @Override
    public void sleep() {
        System.out.println("zzzz");
    }
}
