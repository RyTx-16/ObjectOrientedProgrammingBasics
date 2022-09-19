package Inheritance;

/**
 * @author Ryan Taylor
 * @created 19/09/2022 - 21:12
 */
public class Analyst extends Employee {

    public Analyst(String firstName, String lastName, int age, double salary) {
        super(firstName, lastName, age, salary);
    }

    public double getAnnualBonus () {
        return this.salary *.05;
    }
}
