package lambda.reference;

/* Sometimes lambda expressions do nothing but call an existing method, in those cases its clearer to refer to existing
   method by name, hence Method References.
*/

public class FunctionalCalculator {
/*FunctionalCalculator Class has four static(does not require creating FunctionalCalculator object in main class) methods
  responsible for calculating simple equations. Thanks to this we can replace our lambda expression with method reference:
                (ClassName::methodName) - FunctionalCalculator::multiply/divide/add/subtract
*/

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }
}
