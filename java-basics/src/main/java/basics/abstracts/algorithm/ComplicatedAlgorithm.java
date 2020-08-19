package basics.abstracts.algorithm;

abstract class ComplicatedAlgorithm {

    abstract protected void firstMethodToExecute();

    abstract protected void secondMethodToExecute();

    private void thirdMethodToExecute() {
        System.out.println("3rd method.");
    }
    private void fourthMethodToExecute() {
        System.out.println("4th method.");
    }
    public void run() {
        this.firstMethodToExecute();
        this.secondMethodToExecute();
        this.thirdMethodToExecute();
        this.fourthMethodToExecute();
    }
}
