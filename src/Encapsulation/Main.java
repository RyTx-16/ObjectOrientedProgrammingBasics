package Encapsulation;

/**
 * @author Ryan Taylor
 * @created 19/09/2022 - 21:36
 */
public class Main {
    public static void main(String[] args) {
        Dog dogA = new Dog("Gerald", 2, DogBreed.POMERANIAN);

        System.out.println(dogA.getDogAge());
        dogA.addAge();
        System.out.println(dogA.getDogAge());
    }
}
