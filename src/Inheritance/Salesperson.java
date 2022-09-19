package Inheritance;

/**
 * @author Ryan Taylor
 * @created 19/09/2022 - 21:12
 */
public class Salesperson extends Employee {
    private double commissionPercent;

    public Salesperson(String firstName, String lastName, int age, double salary,  double commissionPercent) {
        super(firstName, lastName, age, salary);
        this.commissionPercent = commissionPercent;
    }

    public double getCommissionPercent() {
        return commissionPercent;
    }

    public void raiseCommissionPercent() {
        if (this.commissionPercent < .30) {
            this.commissionPercent = this.commissionPercent * 1.2;
        }
    }
}
