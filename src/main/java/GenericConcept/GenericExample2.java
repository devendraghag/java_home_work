package GenericConcept;

import java.util.ArrayList;

public class GenericExample2 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//Array are type safe where collection classes are not type safe
		ArrayList list = new ArrayList();
		list.add("abc");
		list.add("xyz");
		list.add(new Integer(11));
		System.out.println(list); // all collection print with [        ]
		
		String name1 = (String) list.get(0); // we need to cast always bcz we did not give gurrenty which object is added in list
		System.out.println(name1);
		
//		String name2 = (String) list.get(2); //  java.lang.ClassCastException: class java.lang.Integ and its runtime exception 
//		System.out.println(name2);
		
		Integer name3 = (Integer) list.get(2);  
		System.out.println(name3);
	}
}
