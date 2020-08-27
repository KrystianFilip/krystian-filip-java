package testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapeList = new ArrayList<>();

    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }
    public boolean removeShape(Shape shape) {
        boolean result = false;
        if(shapeList.contains(shape)) {
            shapeList.remove(shape);
            return true;
        }
        return result;
    }
    public Shape getShape(int shapeNumber) {
        Shape theShape = null;
        if (shapeNumber >= 0 && shapeNumber < shapeList.size()) {
            theShape = shapeList.get(shapeNumber);
        }
        return theShape;
    }
    public void showFigures() {
        if (shapeList.isEmpty()) {
            System.out.println("The list of shapes is empty! There's nothing to display...");
        } else {
            for (Shape shape : shapeList) {
                System.out.println(shape);
            }
        }
    }
}
