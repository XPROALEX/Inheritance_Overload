public class Testing {
    public static void main(String[] args) {

        Shape undefinedShape = new Shape();

        Shape circle = new Shape(5.2);

        Shape square = new Shape(4, 4.7);

        Shape rectangle = new Shape(4, 3.5, 4.7);

        Shape triangle = new Shape(3, 2.5, 3.7, 5.3);

        String undefinedShapeDetails = undefinedShape.getShapeDetails();

        String circleDetails = circle.getShapeDetails();

        String squareDetails = square.getShapeDetails();

        String rectangleDetails = rectangle.getShapeDetails();

        String triangleDetails = triangle.getShapeDetails();

        System.out.println(undefinedShapeDetails);
        System.out.println(circleDetails);
        System.out.println(squareDetails);
        System.out.println(rectangleDetails);
        System.out.println(triangleDetails);
    }
}
