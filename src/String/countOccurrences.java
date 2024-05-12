package String;

import java.util.Scanner;

public class countOccurrences {
    public int CharCount(String str, char target){
        int count = 0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) == target){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = input.next();
        System.out.println("Enter Character: ");
        char target = input.next().charAt(0);

        countOccurrences counter = new countOccurrences();
        int count = counter.CharCount(str,target);

        System.out.println(STR."Occurrences of \{target} in the string is: \{count}");

    }
}
