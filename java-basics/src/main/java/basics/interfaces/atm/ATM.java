package basics.interfaces.atm;

public interface ATM {
    void withdraw();
    void deposit();
    default void connection() {
        System.out.println("We are trying to reach your bank servers.");
    }
    static String terminate() {
        return "Transaction has been completed. The ATM will shut down now.";
    }
}
