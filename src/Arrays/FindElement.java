package Arrays;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Size of Array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter Elements of Array: ");
        for (int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Enter Element: ");
        int k = input.nextInt();

        for (int i=0;i<size;i++){
             if(arr[i] == k){
                 System.out.println(STR."\{k} is found at index \{i}");
             }
        }

    }
}
