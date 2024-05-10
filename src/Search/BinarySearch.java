package Search;

import java.util.Scanner;

public class BinarySearch {
    public int BinarySeach(int[] arr, int k){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = (start + end)/2;
            if (arr[mid] == k){
                return mid;
            }
            else if(arr[mid] < k){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,2,4,5,7,8,9,6,3};
        int k = 1;
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.BinarySeach(arr,k);

        if(result != -1){
            System.out.println(STR."\{k} is found at \{result}");
        }
        else {
            System.out.println(STR."\{k} is not present at the array.");
        }
    }
}
