package TerminalOperatorPrograms;

//Java code for Stream noneMatch
//(Predicate predicate) to check whether
//no elements of this stream match
//the provided predicate.
import java.util.stream.Stream;

class NoneMatch {
	// boolean noneMatch(Predicate<? super T> predicate)
	// Driver code
	public static void main(String[] args) {

		// Creating a Stream of Strings
		Stream<String> stream = Stream.of("CSE", "C++", "Jav", "DS");

		// Using Stream noneMatch(Predicate predicate)
		boolean answer = stream.noneMatch(str -> (str.length() == 4));

		// Displaying the result
		System.out.println(answer);
	}
}
