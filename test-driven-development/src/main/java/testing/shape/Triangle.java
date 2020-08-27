package testing.shape;

public class Triangle implements Shape {
    private String name;
    private double height;
    private double side;

    public Triangle(String name, double height, double side) {
        this.name = name;
        this.height = height;
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getField() {
        return (side/2) * height;
    }

    @Override
    public String toString() {
        return name + "(S : " + side + "/H : " + height + ")";
    }
}
