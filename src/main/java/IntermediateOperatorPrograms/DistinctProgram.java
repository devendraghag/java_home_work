package IntermediateOperatorPrograms;

//Implementation of Stream.distinct()
//to get the distinct elements in the List
import java.util.*;

class DistinctProgram {

	// Driver code
	public static void main(String[] args) {

		// Creating a list of integers
		List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5);

		System.out.println("The distinct elements are :");

		// Displaying the distinct elements in the list
		// using Stream.distinct() method
		list.stream().distinct().forEach(System.out::println);
	}
}


/*
 * distinct() returns a stream consisting of distinct elements in a stream.
 * distinct() is the method of Stream interface. This method uses hashCode() and
 * equals() methods to get distinct elements. In case of ordered streams, the
 * selection of distinct elements is stable. But, in case of unordered streams,
 * the selection of distinct elements is not necessarily stable and can change.
 * distinct() performs stateful intermediate operation i.e, it maintains some
 * state internally to accomplish the operation.
 */