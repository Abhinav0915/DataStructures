package String;

import java.util.Scanner;

public class ReverseString {

    public static String reverseString(String str){
        StringBuilder reversed = new StringBuilder();
        for (int i=str.length() -1;i>=0;i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = input.nextLine();
        String reversedStr = reverseString(str);
        System.out.println(STR."Reversed String: \{reversedStr}");
    }
}
