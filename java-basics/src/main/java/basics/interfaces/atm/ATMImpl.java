package basics.interfaces.atm;

public class ATMImpl implements ATM {
    @Override
    public void withdraw() {
        System.out.println("Withdrawing money.");
    }

    @Override
    public void deposit() {
        System.out.println("Depositing money.");
    }
}
