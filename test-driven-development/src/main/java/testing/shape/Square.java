package testing.shape;

public class Square implements Shape{
    private String name;
    private double sideA;
    private double sideB;

    public Square(String name, double sideA, double sideB) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getField() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return name + "(A : " + sideA + "/B : " + sideB + ")";
    }
}
