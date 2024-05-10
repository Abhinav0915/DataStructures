package Arrays;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for(int i=0;i<size;i++){
            sum += array[i];

        }
        System.out.println(STR."Sum Of Array is: \{sum}");

    }
}
