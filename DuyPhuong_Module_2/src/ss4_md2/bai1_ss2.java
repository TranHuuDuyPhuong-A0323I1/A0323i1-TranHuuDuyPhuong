package ss4_md2;

import java.util.Scanner;

public class bai1_ss2 {
    private double a;
    private double b;
    private double c;

    public bai1_ss2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta > 0) {
            return 0;
        } else {
            return (-b + Math.pow(delta, 0.5)) / (2 * a);
        }
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta > 0) {
            return 0;
        } else {
            return (-b - Math.pow(delta, 0.5)) / (2 * a);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhap b: ");
        double b = scanner.nextDouble();

        System.out.println("Nhap c: ");
        double c = scanner.nextDouble();

        bai1_ss2 equation = new bai1_ss2(a, b, c);

        double delta = equation.getDiscriminant();

        if (delta > 0) {
            double Root1 = equation.getRoot1();
            double Root2 = equation.getRoot2();
            System.out.println("Nghiem co 2 phuong trinh: " + Root1 + "va" + Root2);
        } else if (delta == 0) {
            double Root = equation.getA();
            System.out.println("Nghiem co 1 phuong trinh: " + Root);
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
