package ReadOnlyPrograms;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ReadOnlySet {
	public static void main(String[] args) {
		// Creating an HashSet
		Set<String> originalSet = new HashSet<>();
		// Adding elements to originalSet
		originalSet.add("John");
		originalSet.add("Carlos");
		originalSet.add("David");
		originalSet.add("Ian");
		originalSet.add("Daniel");
		// Printing originalSet
		System.out.println("=========== Original Set ===========");
		System.out.println(originalSet);
		// Creating read only view of the originalSet
		Set<String> readOnlySet = Collections.unmodifiableSet(originalSet);
		// Printing readOnlySet
		System.out.println("=========== Read Only Set ===========");
		System.out.println(readOnlySet);
		// Modification operations on readOnlySet throws
		// UnsupportedOperationException
		try {
			readOnlySet.add("AnyName");
			readOnlySet.remove("John");
		} catch (UnsupportedOperationException e) {
			System.out.println(
					"====== Modifications to read only set not allowed ======");
		}
		// Modification operations on originalSet are reflected in readOnlySet
		// also
		originalSet.add("AnyName");
		originalSet.remove("John");
		// Printing readOnlySet
		System.out.println(
				"====== Modifications to original set are reflected in read only set ======");
		System.out.println("=========== Read Only set ===========");
		System.out.println(readOnlySet);
	}
}