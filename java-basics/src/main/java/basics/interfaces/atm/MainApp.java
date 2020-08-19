package basics.interfaces.atm;

public class MainApp {
    public static void main(String[] args) {
        ATM atm = new ATMImpl();

        atm.connection();
        atm.deposit();
        atm.withdraw();
        System.out.println(ATM.terminate());

    }
}
