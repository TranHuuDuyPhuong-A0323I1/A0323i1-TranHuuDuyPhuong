    package ss3_md2;

    import java.util.Scanner;

    public class bai5_ss3 {
        public static void main(String[] args) {
            final int SIZE = 5;
            int[] arr = new int[SIZE];

            Scanner scanner = new Scanner(System.in);

            // Nhập giá trị cho các phần tử trong mảng từ bàn phím
            System.out.println("Enter " + SIZE + " integers:");
            for (int i = 0; i < SIZE; i++) {
                arr[i] = scanner.nextInt();
            }

            // Tìm phần tử nhỏ nhất trong mảng
            int min = arr[0];
            for (int i = 1; i < SIZE; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

            // In ra giá trị nhỏ nhất
            System.out.println("The minimum value in the array is: " + min);
        }
    }
