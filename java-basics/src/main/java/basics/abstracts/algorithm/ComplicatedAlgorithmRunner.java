package basics.abstracts.algorithm;

public class ComplicatedAlgorithmRunner extends ComplicatedAlgorithm {
    @Override
    protected void firstMethodToExecute() {
        System.out.println("1st method.");
    }

    @Override
    protected void secondMethodToExecute() {
        System.out.println("2nd method.");
    }

    @Override
    public void run() {
        this.firstMethodToExecute();
        this.secondMethodToExecute();
    }
}
