package ReadOnlyPrograms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadOnlyList {
	public static void main(String[] args) {
		// Creating an ArrayList
		List<String> originalList = new ArrayList<String>();
		// Adding elements to originalList
		originalList.add("John");
		originalList.add("Carlos");
		originalList.add("David");
		originalList.add("Ian");
		originalList.add("Daniel");
		// Printing originalList
		System.out.println("=========== Original List ===========");
		System.out.println(originalList);
		// Creating read only view of the originalList
		List<String> readOnlyList = Collections.unmodifiableList(originalList);
		// Printing readOnlyList
		System.out.println("=========== Read Only List ===========");
		System.out.println(readOnlyList);
		// Modification operations on readOnlyList throws
		// UnsupportedOperationException
		try {
			readOnlyList.add("AnyName");
			readOnlyList.remove("John");
			readOnlyList.set(1, "NameChanged");
		} catch (UnsupportedOperationException e) {
			System.out.println(
					"====== Modification operations on read only list not allowed ======");
		}
		// Modification operations on originalList are reflected in readOnlyList
		// also
		originalList.add("AnyName");
		originalList.remove("John");
		originalList.set(1, "NameChanged");
		// Printing readOnlyList
		System.out.println(
				"====== Modifications to original list are reflected in read only list ======");
		System.out.println("=========== Read Only List ===========");
		System.out.println(readOnlyList);
	}
}