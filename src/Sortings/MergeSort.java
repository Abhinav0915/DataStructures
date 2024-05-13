package Sortings;

import java.util.Scanner;

public class MergeSort {

    // Merge two sorted subarrays arr[s..mid] and arr[mid+1..e]
    public static void conquer(int[] arr, int s, int mid, int e){
        // Length of merged array
        int[]  merged = new int[e - s + 1];

        // Index pointers for both subarrays
        int inx1 = s;
        int inx2 = mid + 1;
        int x = 0;

        // Merge the two subarrays
        while(inx1 <= mid && inx2 <= e){
            if(arr[inx1] <= arr[inx2]){
                merged[x++] = arr[inx1++];
            } else {
                merged[x++] = arr[inx2++];
            }
        }

        // Copy remaining elements of arr1[] if any
        while(inx1 <= mid){
            merged[x++] = arr[inx1++];
        }

        // Copy remaining elements of arr2[] if any
        while (inx2 <= e){
            merged[x++] = arr[inx2++];
        }

        // Copy the merged array back to original array arr[]
        for (int i=0, j=s; i < merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }

    // Divide the array into two subarrays, sort them and then merge them
    public static void divide(int[] arr, int s, int e){
        if (s >= e){
            return;
        }
        int mid = s + (e - s)/2;
        divide(arr, s, mid);       // Sort the first half
        divide(arr, mid + 1, e);   // Sort the second half
        conquer(arr, s, mid, e);   // Merge the sorted halves
    }

    // Main function to test the MergeSort algorithm
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        divide(arr, 0, n - 1);  // Call merge sort

        // Print the sorted array
        for (int j : arr){
            System.out.print(STR."\{j} ");
        }
    }
}
