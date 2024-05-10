package Search;

import java.util.Scanner;

public class LinearSearch {
    public int LinearSeach(int[] arr, int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter Array's Elements: ");
        for (int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter Element To Search: ");
        int k = scanner.nextInt();

        LinearSearch linearSearch = new LinearSearch();
        int result = linearSearch.LinearSeach(arr,k);

        if (result != -1){
            System.out.println(k + " is found at " + result);
        }else {
            System.out.println(k + " is not found in the array");
        }
    }
}
