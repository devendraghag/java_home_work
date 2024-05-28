package IntermediateOperatorPrograms;

//Java code for Stream filter
//(Predicate predicate) to get a stream
//consisting of the elements of this
//stream that match the given predicate.

// Java code for Stream filter
// (Predicate predicate) to get a stream
// consisting of the elements of this
// stream that match the given predicate.
import java.util.stream.Stream;

class FilterProgram2 {

	// Driver code
	public static void main(String[] args) {

		// Creating a Stream of Strings
		Stream<String> stream = Stream.of("Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks");

		// Using Stream filter(Predicate predicate)
		// to get a stream consisting of the
		// elements having UpperCase Character
		// at index 1
		stream.filter(str -> Character.isUpperCase(str.charAt(1))).forEach(System.out::println);
	}
}
