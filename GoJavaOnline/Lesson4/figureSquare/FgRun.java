package mod4.figures;

public class FgRun {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);
        Rectangle rectangle = new Rectangle(50, 50);
        Circle circle = new Circle(15);

        System.out.println(triangle.square());
        System.out.println(rectangle.square());
        System.out.println(circle.square());
    }

}
