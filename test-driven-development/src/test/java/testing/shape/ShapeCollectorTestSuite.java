package testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    public static int testCounter = 0;
    @BeforeClass
    public static void beforeALlTestes() {
        System.out.println("Shape Collector Test Suite initiated...");
        System.out.println();
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println();
        System.out.println("Shape Collector Test Suite ended. \nWith total number of cases: " + testCounter);
    }
    @Before
    public void beforeEachTest() {
        testCounter++;
        System.out.println("Preparing for test #" + testCounter + ":");

    }
    @Test
    public void testAddFigure() {
        //Given
        Shape shape = new Triangle("Triangle", 10.0,4.0);
        ShapeCollector collector = new ShapeCollector();
        //When
        collector.addFigure(shape);
        //Then
        Assert.assertEquals(1, collector.getShapeList().size());
        System.out.println(".addFigure() method works perfect.");

    }
    @Test
    public void testRemoveFigure() {
        //Given
        Shape shape = new Triangle("Triangle", 10.0,4.0);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(shape);
        //When
        boolean result = collector.removeShape(shape);
        //Then
        System.out.println(".removeFigure() method works perfect.");
        Assert.assertTrue(result);
        Assert.assertEquals(0,collector.getShapeList().size());
    }
    @Test
    public void testGetFigure() {
        //Given
        Shape shape = new Triangle("Triangle", 10.0,4.0);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(shape);
        //When
        Shape retrievedShape;
        retrievedShape = collector.getShape(0);
        //Then
        System.out.println(".getFigure() method works perfect.");
        Assert.assertEquals(shape,retrievedShape);
    }
    @Test
    public void testShowFigures() {
        //Given
        Shape shape = new Triangle("Triangle", 10.0,4.0);
        Shape shape2 = new Circle("Circle", 6.5);
        Shape shape3 = new Square("Square", 4.6,5.2);
        ShapeCollector collector  = new ShapeCollector();
        collector.addFigure(shape);
        collector.addFigure(shape2);
        collector.addFigure(shape3);
        //When
        collector.showFigures();
        //then
        System.out.println(".showFigures() method works perfect.");
        Assert.assertEquals(3,collector.getShapeList().size());
    }

}
