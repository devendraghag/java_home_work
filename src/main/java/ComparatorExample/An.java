package ComparatorExample;

import java.util.Comparator;

public class An implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int i = o1.getName().compareTo(o2.getName());
		if (i != 0)
			return i;
		i = o1.getLocation().compareTo(o2.getLocation());
		if (i != 0)
			return i;
		return o1.getSalary().compareTo(o2.getSalary());
	}
	
}