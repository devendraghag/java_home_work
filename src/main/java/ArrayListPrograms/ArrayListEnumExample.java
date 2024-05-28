package ArrayListPrograms;

import java.util.Enumeration;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEnumExample {

	@SuppressWarnings({"unchecked", "rawtypes"})
	public static void main(String[] args) {
		// create an ArrayList object
		//ArrayList<String> arrayList = new ArrayList<String>();
		ArrayList arrayList = new ArrayList();

		// Add elements to ArrayList
		arrayList.add("C");
		arrayList.add("C++");
		arrayList.add("Java");
		arrayList.add("DotNet");
		arrayList.add("Perl");
		//arrayList.add(new Integer(2));// this will accept if no type of list is define
		//arrayList.add(new Integer(2)); it will through error because list is String type

		// Get the Enumeration object
		Enumeration<String> e = Collections.enumeration(arrayList);

		// Enumerate through the ArrayList elements
		System.out.println("ArrayList elements: ");
		while (e.hasMoreElements())
			System.out.println(e.nextElement());// still we get new Integer(2) as classCastException
	}
}