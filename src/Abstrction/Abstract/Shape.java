package Abstrction.Abstract;

/**
 * @author Ryan Taylor
 * @created 20/09/2022 - 01:43
 */
public abstract class Shape {
    abstract void draw();
    void signature(){
        System.out.println("Derived from the abstract shape class.");
    }
}
