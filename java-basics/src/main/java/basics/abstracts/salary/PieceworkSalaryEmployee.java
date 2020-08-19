package basics.abstracts.salary;

public class PieceworkSalaryEmployee implements Employee {
    private final double qty;
    private final double pieceWorkRatio;

    public PieceworkSalaryEmployee(final double qty, final double pieceWorkRatio) {
        this.qty = qty;
        this.pieceWorkRatio = pieceWorkRatio;
    }

    @Override
    public double calculateSalary() {
        return qty * pieceWorkRatio;
    }
}
