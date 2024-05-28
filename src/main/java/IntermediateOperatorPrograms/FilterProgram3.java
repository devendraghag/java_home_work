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

// Java code for Stream filter
// (Predicate predicate) to get a stream
// consisting of the elements of this
// stream that match the given predicate.

class FilterProgram3 {

	// Driver code
	public static void main(String[] args) {

		// Creating a Stream of Strings
		Stream<String> stream = Stream.of("Geeks", "foR", "GeEksQuiz", "GeeksforGeeks");

		// Using Stream filter(Predicate predicate)
		// to get a stream consisting of the
		// elements ending with s
		stream.filter(str -> str.endsWith("s")).forEach(System.out::println);
	}
}
