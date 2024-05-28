package Simple;

import java.util.ArrayList;

public class ForEach2 {
    public static void main(String[] args) {
        //An ArrayList of strings
        ArrayList<String> list = new ArrayList<String>();

        //Adding elements to ArrayList
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");

        //iterating every element of list using for-each loop
        for (String s : list) {
            System.out.println(s);
        }
    }
}
