package basics.abstracts.atm;

public class Atm extends Bank {
    @Override
    protected void insertCard() {
        System.out.println("Please insert your Credit Card.");
    }

    @Override
    protected void enterPin() {
        System.out.println("Please enter your PIN number.");
    }

    @Override
    protected void enterAmount() {
        System.out.println("Please enter the amount you'd like to withdraw.");
    }

    @Override
    protected void payout() {
        System.out.println("Please remove your card and collect the money.");
    }

    @Override
    protected void shutdown() {
        System.out.println("Thank you for using our ATM.");
    }

}
