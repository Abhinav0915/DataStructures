package Arrays;

public class StaticArray {
    public static void main(String[] args) {
        //Creating Static Array
        int[] numbers = {2,4,6,8,10};

        //Printing Array Elements
        System.out.println(STR."First Element: \{numbers[0]}");
        System.out.println(STR."Second Element: \{numbers[1]}");

        //Modifying Elements
        numbers[3] = 60;

        //Printing All Elements of the Array
        System.out.println("All Array Elements are: ");
        for (int number : numbers) {
            System.out.println(number);
        }

        //Print the length of the Array
        int length = numbers.length;
        System.out.println(STR."Length of the array is: \{length}");
    }
}