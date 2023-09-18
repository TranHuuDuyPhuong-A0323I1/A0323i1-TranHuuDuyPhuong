package ss7_md2.bai2;

public class Square extends Colorable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

}
