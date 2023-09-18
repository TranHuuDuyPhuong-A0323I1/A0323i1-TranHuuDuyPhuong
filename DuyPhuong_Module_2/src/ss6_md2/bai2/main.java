package ss6_md2.bai2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập x: ");
        int n = scanner.nextInt();

        System.out.print("Nhập y: ");
        int m = scanner.nextInt();

        System.out.print("Nhap z: ");

        int z = scanner.nextInt();

        Point2D point2d = new Point2D(n, m);
        System.out.println(point2d);

        Point3D point3d = new Point3D(n, m, z);
        System.out.println(point3d);
    }
}
