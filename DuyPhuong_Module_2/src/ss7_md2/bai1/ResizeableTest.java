package ss7_md2.bai1;

public class ResizeableTest {
    public static void main(String[] args) {
        Circle circle = new Circle(10.0);
        System.out.println("Circle before resizing: " + circle.getArea());

        circle.resize(100);
        System.out.println("Circle after resizing: " + circle.getArea());

        Rectangle rectangle = new Rectangle(6.0, 8.0);
        System.out.println("Rectangle before resizing: " + rectangle.getArea());

        rectangle.resize(75);
        System.out.println("Rectangle after resizing: " + rectangle.getArea());

        Square square = new Square(4.0);
        System.out.println("Square before resizing: " + square.getArea());

        square.resize(30);
        System.out.println("Square after resizing: " + square.getArea());
    }
}
