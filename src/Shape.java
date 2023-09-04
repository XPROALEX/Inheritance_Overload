public class Shape {
    private String shapeName;
    private int numberOfEdges;

    public Shape() {
        shapeName = "Undefined shape";
        System.out.println("Undefined Shape has been created");
    }

    public Shape(double radius) {
        shapeName = "Circle";
        System.out.println("Circle has been created");
    }

    public Shape(int edges, double edgeLength) {
        shapeName = "Square";
        System.out.println("Square has been created");
        numberOfEdges = edges;
    }

    public Shape(int edges, double e1, double e2) {
        shapeName = "Rectangle";
        System.out.println("Rectangle has been created");
        numberOfEdges = edges;
    }

    public Shape(int edges, double e1, double e2, double e3) {
        shapeName = "Triangle";
        System.out.println("Triangle has been created");
        numberOfEdges = edges;
    }

    public String getShapeDetails() {
        return shapeName + " " + numberOfEdges;
    }
}
