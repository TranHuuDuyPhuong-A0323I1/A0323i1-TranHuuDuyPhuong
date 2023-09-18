package ss3_md2;

import java.util.Scanner;

public class bai6_ss3 {
    public static void main(String[] args) {
        // Tạo một mảng hai chiều có sẵn các phần tử
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Hỏi người dùng muốn tính tổng của cột mấy
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the column number to sum: ");
        int column = scanner.nextInt();

        // Tính tổng của cột được chọn
        int sum = 0;
        for (int[] matrix1 : matrix) {
            sum += matrix1[column];
        }

        // In ra tổng của cột được chọn
        System.out.println("The sum of column " + column + " is: " + sum);
    }
}
