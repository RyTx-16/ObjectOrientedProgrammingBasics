package Abstrction.Abstract;

/**
 * @author Ryan Taylor
 * @created 20/09/2022 - 01:47
 */
public class Main {
    public static void main(String[] args) {
        Shape sq = new Square();
        Shape ci = new Circle();
        sq.draw();
        sq.signature();
        ci.draw();
        ci.signature();
    }
}
