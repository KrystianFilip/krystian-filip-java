package basics.abstracts.salary;

public class FixedSalaryEmployee implements Employee {
    private final double salary;

    public FixedSalaryEmployee(final double salary) {
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
