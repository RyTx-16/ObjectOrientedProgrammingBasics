package Polymorphism.Overloading;

/**
 * @author Ryan Taylor
 * @created 20/09/2022 - 00:59
 */
public class MethodOverloading {
    static int add(int a, int b){
        return a + b;
    }

    static int add(int a, int b, int c){
        return a + b + c;
    }

    static double add(double a, double b, double c){
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Add with 2 params: " + add(1,2));
        System.out.println("Add with 3 params: " + add(1,2,3));
        System.out.println("Add with 3 params as doubles: " + add(1.0,2.0,3.0));
    }
}
