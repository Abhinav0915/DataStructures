package Arrays;

import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Enter Array Size
        System.out.println("Enter Array Size: ");
        int size = scanner.nextInt();

        //Create array according to the user defined size
        int[] arr = new int[size];

        //Ask Elements from the user
        System.out.println("Enter the elements of the array: ");
        for (int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }

        //Print the array
        System.out.println("Array Elements Are: ");
        for (int i=0;i<size;i++){
            System.out.println(STR."Elements are: \{arr[i]}");
        }
    }
}
