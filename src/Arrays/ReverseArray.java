package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Array Size: ");
        int size = scanner.nextInt();

        System.out.println("Enter Elements of Array: ");
        int[] arr = new int[size];

        for (int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Original Array: ");
        for (int i=0;i<size;i++){
            System.out.print(STR."\{arr[i]} ");

        }
        System.out.println();

        System.out.println("Reversed Array: ");
        for (int i=size-1;i>=0;i--){
            System.out.print(STR."\{arr[i]} ");

        }
    }
}
