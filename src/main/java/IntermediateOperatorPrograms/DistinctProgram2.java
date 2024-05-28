package IntermediateOperatorPrograms;

//Implementation of Stream.distinct()
//to get the distinct elements in the List
import java.util.*;

// Implementation of Stream.distinct()
// to get the distinct elements in the List

class DistinctProgram2 {

	// Driver code
	public static void main(String[] args) {

		// Creating a list of strings
		List<String> list = Arrays.asList("Geeks", "for", "Geeks", "GeeksQuiz", "for", "GeeksforGeeks");

		System.out.println("The distinct elements are :");

		// Displaying the distinct elements in the list
		// using Stream.distinct() method
		list.stream().distinct().forEach(System.out::println);
	}
}
