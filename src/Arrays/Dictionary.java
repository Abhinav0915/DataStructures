package Arrays;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static void main(String[] args){
        Map<String,String> myDic = new HashMap<>();

        myDic.put("Apple", "Red Color");
        myDic.put("Grapes", "Green Color");
        myDic.put("Oranges", "Orange Color");

        System.out.println("Color of Oranges are: " + myDic.get("Oranges"));

        System.out.println("Color of Apples are: " + myDic.get("Apple"));
    }
}
