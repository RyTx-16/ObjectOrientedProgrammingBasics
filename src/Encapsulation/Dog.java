package Encapsulation;

/**
 * @author Ryan Taylor
 * @created 19/09/2022 - 21:32
 */
public class Dog {
    private String dogName;
    private int dogAge;
    private DogBreed dogBreed;

    public Dog(String dogName, int dogAge, DogBreed dogBreed) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogBreed = dogBreed;
    }

    public void addAge() {
        this.dogAge = this.dogAge+1;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    public DogBreed getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(DogBreed dogBreed) {
        this.dogBreed = dogBreed;
    }
}
