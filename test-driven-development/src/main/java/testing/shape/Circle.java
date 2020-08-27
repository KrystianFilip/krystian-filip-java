package testing.shape;

public class Circle implements Shape {
    private String name;
    private double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getField() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return name + "(R: " +radius+")";
    }
}
