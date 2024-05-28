package ArrayListPrograms;
import java.util.ArrayList;
import java.util.Collections;
 
public class ArrayListSorting3 
{       
    public static void main(String[] args) 
    {
        //Creating an ArrayList of integers
        ArrayList<Integer> list = new ArrayList<Integer>();
        //Adding elements to list
        list.add(1452);
        list.add(6854);
        list.add(8741);
        list.add(6542);
        list.add(3845);
        System.out.println("ArrayList Before Sorting :");
        System.out.println(list);
        //Sorting the list in the reverse order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("ArrayList Sorted In The Reverse Order :");
        System.out.println(list);
    }   
}