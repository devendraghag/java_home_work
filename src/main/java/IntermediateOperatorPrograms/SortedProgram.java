package IntermediateOperatorPrograms;

//Implementation of Stream.sorted()
//to get a stream of elements
//sorted in their natural order
import java.util.*;

class SortedProgram {

	// Driver code
	public static void main(String[] args) {

		// Creating a list of integers
		List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);

		System.out.println("The sorted stream is : ");

		// displaying the stream with elements
		// sorted in natural order
		list.stream().sorted().forEach(System.out::println);
	}
}
