package ArrayListPrograms;
import java.util.ArrayList;
import java.util.Collections;
 
public class ArrayListSorting2 
{       
    public static void main(String[] args) 
    {
        //Creating an ArrayList of strings
        ArrayList<String> list = new ArrayList<String>();
        //Adding elements to list
        list.add("Virat");
        list.add("rohit");
        list.add("Shikar");
        list.add("ashwin");
        list.add("ravindra");
        list.add("Bhargav");
        System.out.println("ArrayList Before Sorting :");
        System.out.println(list);
        //Sorting the list by ignoring the case
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        System.out.println("ArrayList After Sorting :");
        System.out.println(list);
    }   
}