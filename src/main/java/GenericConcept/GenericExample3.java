package GenericConcept;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericExample3 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//ArrayList is based type and String is parameter type
		ArrayList <String> list = new ArrayList<String> ();
		List <String> list1 = new ArrayList<String> ();
		//List <String> list1 = new List<String> ();
		Collection <String> list2 = new ArrayList<String> ();
		//Collection <String> list2 = new Collection<String> ();
		//ArrayList <Object> list3 = new ArrayList<String> (); polymorphic concept applicable to based type but not for parameter type
		//ArrayList <String> list3 = new ArrayList<Object> ();
		
		//usage of parent refer to hold child refernce know as polymorphic reference
		
		//ArrayList <int> list4 = new ArrayList<int> (); class and interface name we can take as parameter type but not primitives
	}
}
