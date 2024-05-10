package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class IfArrayIsSorted {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Array Size: ");
        int size = scanner.nextInt();

        System.out.println("Enter Elements of Array: ");
        int[] arr = new int[size];

        for (int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }

        boolean sorted = true;
        for(int i=0;i<size-1;i++){
            if (arr[i] > arr[i+1]){
                sorted = false;
                break;
            }

        }

        if(!sorted){
            System.out.println("Array is not Sorted");
        }
        else{
            System.out.println("Array is Sorted");
        }


    }
}
