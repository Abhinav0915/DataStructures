package Arrays;

import java.util.*;

public class ListImpl {
    public static void main (String[] args){
        List<String> mylist = new ArrayList<>();

        mylist.add("Apple");
        mylist.add("Mango");
        mylist.add("Grapes");
        mylist.add("Tomato");

        System.out.println("Elements in the list are: ");
        for (String item : mylist){
            System.out.println(item);
        }
    }
}
