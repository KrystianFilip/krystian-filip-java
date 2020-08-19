package basics.abstracts.salary;

public class MainApp {
    public static void main(String[] args) {
        FixedSalaryEmployee employee1 = new FixedSalaryEmployee(5000.0);
        SalaryPayoutProcessor processor1 = new SalaryPayoutProcessor(employee1);
        processor1.processPayout();
        System.out.println();
        HourlySalaryEmployee employee2 = new HourlySalaryEmployee(168, 28);
        SalaryPayout processor2 = new SalaryPayoutProcessor(employee2);
        processor2.processPayout();
        System.out.println();
        PieceworkSalaryEmployee employee3 = new PieceworkSalaryEmployee(2765, 2);
        SalaryPayoutProcessor processor3 = new SalaryPayoutProcessor(employee3);
        processor3.processPayout();
        System.out.println();
        FixedPlusBonusSalaryEmployee employee4 = new FixedPlusBonusSalaryEmployee(4000, false);
        SalaryPayoutProcessor processor4 = new SalaryPayoutProcessor(employee4);
        processor4.processPayout();
    }
}
