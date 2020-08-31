package lambda.basicexamples;

import lambda.reference.FunctionalCalculator;

public class Main {
    public static void main(String[] args) {
        SaySomething saySomething = new SaySomething();
        saySomething.say();
        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);
        Executor execute = () -> System.out.println("I am saying nothing.");
        processor.execute(execute);


        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10,5, (a,b) -> a + b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a - b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a * b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a / b);
        System.out.println();

        expressionExecutor.executeExpression(7,5, FunctionalCalculator::add);
        expressionExecutor.executeExpression(7,5, FunctionalCalculator::subtract);
        expressionExecutor.executeExpression(7,5, FunctionalCalculator::multiply);
        expressionExecutor.executeExpression(7,5, FunctionalCalculator::divide);
    }
}
