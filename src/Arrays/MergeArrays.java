package Arrays;

import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Size of Array 1: ");
        int size1 = scanner.nextInt();

        int[] arr1 = new int[size1];

        System.out.println("Enter Elements of Array 1: ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Enter Size of Array 2: ");
        int size2 = scanner.nextInt();

        int[] arr2 = new int[size2];

        System.out.println("Enter Elements of Array 2: ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }

        int mergedArraySize = size1 + size2;

        int[] mergedArray = new int[mergedArraySize];

        // Copy elements from arr1 to mergedArray
        for (int i = 0; i < size1; i++) {
            mergedArray[i] = arr1[i];
        }

        // Copy elements from arr2 to mergedArray starting from index size1
        for (int i = 0; i < size2; i++) {
            mergedArray[size1 + i] = arr2[i];
        }

        System.out.println("Merged Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}
