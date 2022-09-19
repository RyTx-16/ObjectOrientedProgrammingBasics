package Inheritance;

/**
 * @author Ryan Taylor
 * @created 19/09/2022 - 21:12
 */
public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    protected double salary;

    public Employee(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void raiseSalary(){
        this.salary = this.salary * 1.2;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}
