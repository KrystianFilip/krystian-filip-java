package lambda.basicexamples;

public class ExecuteSaySomething implements Executor{
    @Override
    public void process() {
        System.out.println("I am saying nothing.");
    }
}
