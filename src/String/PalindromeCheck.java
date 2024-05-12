package String;

import java.util.Scanner;

public class PalindromeCheck {
    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;
        while (left < right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter A String: ");
      String str = input.next();

      if (isPalindrome(str)){
          System.out.println("String is Palindrome");
      }
      else {
          System.out.println("String in not Palindrome");
      }
  }




}
