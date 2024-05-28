package IntermediateOperatorPrograms;

// Java code for Stream map(Function mapper)
// to get a stream by applying the
// given function to this stream.
import java.util.*;

class MapProgram3 {

	// Driver code
	public static void main(String[] args) {

		System.out.println("The stream after applying " + "the function is : ");

		// Creating a list of Strings
		List<String> list = Arrays.asList("Geeks", "FOR", "GEEKSQUIZ", "Computer", "Science", "gfg");

		// Using Stream map(Function mapper) and
		// displaying the length of each String
		list.stream().map(str -> str.length()).forEach(System.out::println);
	}
}
