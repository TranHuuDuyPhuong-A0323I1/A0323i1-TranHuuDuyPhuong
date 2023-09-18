package ss5_md2.bai2;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Radius of C1 is: " + c1.getRadius());
        System.out.println("Area of C1 is: " + c1.getAre());

        Circle c2 = new Circle(2.0);
        System.out.println("Radius of C1 is: " + c2.getRadius());
        System.out.println("Area of C1 is: " + c2.getAre());
    }
}
