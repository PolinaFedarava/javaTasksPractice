package class5_1;

public class Employee extends Person{
    double salary;

    public Employee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }
}
