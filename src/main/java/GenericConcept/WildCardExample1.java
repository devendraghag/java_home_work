package GenericConcept;

import java.util.ArrayList;

public class WildCardExample1 {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("null");
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(123);
	}
	
	public static void m1(ArrayList<?> str)
	{
		
	}
	


}
