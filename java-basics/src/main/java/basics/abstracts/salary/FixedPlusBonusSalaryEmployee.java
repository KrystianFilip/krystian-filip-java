package basics.abstracts.salary;

public class FixedPlusBonusSalaryEmployee implements Employee {
    private final double fixedSalary;
    private boolean isSaleThresholdObtained;

    public FixedPlusBonusSalaryEmployee(double fixedSalary, boolean isSaleThresholdObtained) {
        this.fixedSalary = fixedSalary;
        this.isSaleThresholdObtained = isSaleThresholdObtained;
    }

    @Override
    public double calculateSalary() {
        if (isSaleThresholdObtained) {
            return fixedSalary + (fixedSalary * 0.2);
        } else {
            return fixedSalary;
        }
    }
}
