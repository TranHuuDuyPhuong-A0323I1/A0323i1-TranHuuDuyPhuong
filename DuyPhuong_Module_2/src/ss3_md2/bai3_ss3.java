package ss3_md2;

import java.util.Scanner;

public class bai3_ss3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo hai mảng với kích thước cho trước
        int[] arr1 = new int[5];
        int[] arr2 = new int[4];

        // Nhập giá trị cho các phần tử trong mảng 1
        System.out.println("Enter elements for array 1:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Nhập giá trị cho các phần tử trong mảng 2
        System.out.println("Enter elements for array 2:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Tạo mảng thứ 3 với kích thước bằng tổng kích thước của hai mảng trước đó
        int[] arr3 = mergeArrays(arr1, arr2);

        // In ra mảng 3 sau khi gộp
        System.out.println("Array 3 after merging:");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int index = 0;

        // Gán các phần tử của mảng 1 vào mảng mergedArray
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[index] = arr1[i];
            index++;
        }

        // Gán các phần tử của mảng 2 vào mảng mergedArray
        for (int i = 0; i < arr2.length; i++) {
            mergedArray[index] = arr2[i];
            index++;
        }

        return mergedArray;
    }
}
