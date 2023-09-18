package ss2_md2;

import java.util.Scanner;

import static java.lang.System.*;

public class bai1_ss2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:\n1. Print the rectangle\n2. Print the square triangle\n3. Print isosceles triangle\n4. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter height: ");
                    int height = scanner.nextInt();
                    System.out.println("Enter width: ");
                    int width = scanner.nextInt();
                    printRectangle(height, width);
                    break;
                case 2:
                    System.out.println("Enter height: ");
                    height = scanner.nextInt();
                    printSquareTriangle(height);
                    break;
                case 3:
                    System.out.println("Enter height: ");
                    height = scanner.nextInt();
                    printIsoscelesTriangle(height);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void printRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printSquareTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printIsoscelesTriangle(int height) {
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
