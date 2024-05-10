package Arrays;

import java.util.Scanner;

public class CumulativeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");

        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] cumulativeSum = new int[size];
        cumulativeSum[0] = arr[0];

        for (int i = 1; i < size; i++) {
            cumulativeSum[i] = cumulativeSum[i - 1] + arr[i];
        }

        System.out.println("Cumulative Sum Array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(STR."\{cumulativeSum[i]} ");
        }
    }
}
