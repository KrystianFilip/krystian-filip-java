package basics.abstracts.salary;

public class HourlySalaryEmployee implements Employee{
    private final double hours;
    private final double rate;

    public HourlySalaryEmployee(final double hours, final double rate) {
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public double calculateSalary() {
        return hours * rate;
    }
}
