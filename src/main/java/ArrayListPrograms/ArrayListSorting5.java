package ArrayListPrograms;
import java.util.ArrayList;
import java.util.Collections;
 
//Student1 class implementing Comparable interface
 
class Student1 implements Comparable<Student1>
{
    int id;
    String name;
    int percentage;
     
	public Student1(int id, String name, int percentage)
    {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }
     
    @Override
    public int compareTo(Student1 s)
    {
        return this.id - s.id;     //Sorts the objects in ascending order
        // return s.id - this.id;    //Sorts the objects in descending order
    }
     
    @Override
    public String toString()
    {
        return "{ID : "+id+", Name : "+name+", Percentage : "+percentage+"}";
    }
}
 
public class ArrayListSorting5 
{       
    public static void main(String[] args) 
    {
        //Creating an ArrayList of Student1 objects
        ArrayList<Student1> listOfStudent1s = new ArrayList<Student1>();
        //Adding Student1s to listOfStudent1s
        listOfStudent1s.add(new Student1(123, "Student11", 62));
        listOfStudent1s.add(new Student1(231, "Student12", 81));
        listOfStudent1s.add(new Student1(85, "Student13", 79));
        listOfStudent1s.add(new Student1(478, "Student14", 94));
        listOfStudent1s.add(new Student1(365, "Student15", 62));
        System.out.println("listOfStudent1s Before Sorting :");
        System.out.println(listOfStudent1s);
        //Sorting the listOfStudent1s
        Collections.sort(listOfStudent1s);
        System.out.println("listOfStudent1s After Sorting :");
        System.out.println(listOfStudent1s);
    }   
}