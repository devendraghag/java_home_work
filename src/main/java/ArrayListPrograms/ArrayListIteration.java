package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

class ArrayListIteration {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("FIRST");
		list.add("SECOND");
		list.add("THIRD");
		list.add("FOURTH");
		list.add("FIFTH");

//		// 1. Using for loop
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//
//		// 2. Using Iterator
//		Iterator<String> it = list.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//			// Removing an element from list
//			it.remove();
//		}
//
//		// 3. Using ListIterator
//		ListIterator<String> listIt = list.listIterator();
//		while (listIt.hasNext()) {
//			System.out.println(listIt.next());
//		}
//
//		// 4. Using enhanced for loop
//		for (String element : list) {
//			System.out.println(element);
//		}
		
		Enumeration<String> e = Collections.enumeration(list);
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}