package basics.abstracts.atm;

abstract class Bank {
private void processRequest() {
    System.out.println("Bank is processing your withdraw request.");
}
private void checkBalance() {
    System.out.println("Checking your account balance.");
}
private void confirmWithdraw() {
    System.out.println("Withdraw is available.");
}
abstract protected void insertCard();
abstract protected void enterPin();
abstract protected void enterAmount();
abstract protected void payout();
abstract protected void shutdown();

public void run() {
    this.insertCard();
    this.enterPin();
    this.enterAmount();
    this.processRequest();
    this.checkBalance();
    this.confirmWithdraw();
    this.payout();
    this.shutdown();
}
}

