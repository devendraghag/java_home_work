package IntermediateOperatorPrograms;

//Implementation of Stream.sorted()
//to get a stream of elements
//sorted in their natural order
import java.util.*;

// Implementation of Stream.sorted()
// to get a stream of elements
// sorted in their natural order

class SortedProgram2 {

	// Driver code
	public static void main(String[] args) {

		// Creating a list of strings
		List<String> list = Arrays.asList("Geeks", "for", "GeeksQuiz", "GeeksforGeeks", "GFG");

		System.out.println("The sorted stream is : ");

		// displaying the stream with elements
		// sorted in their natural order
		list.stream().sorted().forEach(System.out::println);
	}
}
