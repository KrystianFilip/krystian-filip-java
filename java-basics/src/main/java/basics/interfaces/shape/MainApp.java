package basics.interfaces.shape;

public class MainApp {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();
        Shape rectangle = new Rectangle();

        ShapeDrawer drawer = new ShapeDrawer(circle);
        ShapeDrawer drawer1 = new ShapeDrawer(square);
        ShapeDrawer drawer2 = new ShapeDrawer(rectangle);

        drawer.process();
        System.out.println();
        drawer1.process();
        System.out.println();
        drawer2.process();
    }
}
