package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompting user to enter the size of the array
        System.out.println("Enter Size of Array: ");
        int size = input.nextInt();

        // Creating an array of given size to store user input
        int[] arr = new int[size];

        // Prompting user to enter elements of the array
        System.out.println("Enter Elements of Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        // Creating a HashMap to store occurrences of elements
        Map<Integer, Integer> occurrences = new HashMap<>();

        // Counting occurrences of each element in the array
        for (int element : arr) {
            // If the element is already in the map, increment its occurrence count
            if (occurrences.containsKey(element)) {
                occurrences.put(element, occurrences.get(element) + 1);
            } else { // Otherwise, add the element to the map with occurrence count 1
                occurrences.put(element, 1);
            }
        }

        // Printing the elements along with their occurrences
        System.out.println("Element: Occurrences");
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println(STR."\{entry.getKey()} : \{entry.getValue()}");
        }
    }
}
