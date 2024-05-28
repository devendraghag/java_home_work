package ArrayListPrograms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
 
//Student class implementing Comparable interface
 
class Student implements Comparable<Student>
{
    int id;
    String name;
    int percentage;
     
    public Student(int id, String name, int percentage)
    {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }
     
    @Override
    public int compareTo(Student s)
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
 
//Defining our own Comparator
 
class OrderByPercentage implements Comparator<Student>
{
    @Override
    public int compare(Student s1, Student s2)
    {
        return s1.percentage - s2.percentage;
    }
}
 
public class ArrayListSorting4 
{       
    public static void main(String[] args) 
    {
        //Creating an ArrayList of Student objects
        ArrayList<Student> listOfStudents = new ArrayList<Student>();
        //Adding students to listOfStudents
        listOfStudents.add(new Student(123, "Student1", 62));
        listOfStudents.add(new Student(231, "Student2", 81));
        listOfStudents.add(new Student(85, "Student3", 79));
        listOfStudents.add(new Student(478, "Student4", 94));
        listOfStudents.add(new Student(365, "Student5", 62));
        System.out.println("listOfStudents Before Sorting :");
        System.out.println(listOfStudents);
        //Sorting the listOfStudents by percentage
        Collections.sort(listOfStudents, new OrderByPercentage());
        System.out.println("listOfStudents After Sorting :");
        System.out.println(listOfStudents);
    }   
}