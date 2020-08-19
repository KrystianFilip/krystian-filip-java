package basics.abstracts.salary;

public class SalaryPayoutProcessor extends SalaryPayout {
    private Employee employee;

    public SalaryPayoutProcessor(Employee employee) {
        super(employee);

    }

    @Override
    protected void payout() {
        System.out.println("Sending money to employee.");
    }
}
