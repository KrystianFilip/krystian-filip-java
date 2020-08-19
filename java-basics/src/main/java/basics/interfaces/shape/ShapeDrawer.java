package basics.interfaces.shape;

public class ShapeDrawer {
    private Shape shape;

    public ShapeDrawer (Shape shape) {
        this.shape = shape;
    }
    public void process() {
        System.out.println("Choosing shape...");
        this.shape.draw();
        System.out.println("Shape has been drawn.");
    }
}
