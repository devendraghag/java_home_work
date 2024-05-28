package ComparatorExample;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
 
public class ComparatorComparingThen 
{
    public static void main(String[] args) 
    {
        ArrayList<Employee> employees = getUnsortedEmployeeList();
         
        //Compare by first name and then last name
        Comparator<Employee> compareByName = Comparator
                                                .comparing(Employee::getName)
                                                .thenComparing(Employee::getLocation);
         
        Collections.sort(employees, compareByName);
         
        for(Employee e: employees)
		{
			System.out.println(e.getLocation() + " " + e.getName() + " " + e.getSalary());
		}
    }
 
    private static ArrayList<Employee> getUnsortedEmployeeList() 
    {
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee("Devendra", "Kalyan1", 1.1));
		al.add(new Employee("Devendra1", "Kalyan2", 1.0));
		al.add(new Employee("Devendra2", "Kalyan", 1.1));
        return al;
    }
}