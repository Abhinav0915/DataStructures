package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Array Size: ");
        int size = scanner.nextInt();

        System.out.println("Enter Elements of Array: ");
        int[] arr = new int[size];

        for (int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(STR."Maximum Element is: \{arr[size - 1]}");


    }
}
