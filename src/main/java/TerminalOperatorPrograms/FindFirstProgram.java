package TerminalOperatorPrograms;

//Java code for Stream findFirst()
//which returns an Optional describing
//the first element of this stream, or
//an empty Optional if the stream is empty.
import java.util.*;

class FindFirstProgram {
	//Optional<T> findFirst()
	// Driver code
	public static void main(String[] args) {

		// Creating a List of Integers
		List<Integer> list = Arrays.asList(3, 5, 7, 9, 11);

		// Using Stream findFirst()
		Optional<Integer> answer = list.stream().findFirst();

		// if the stream is empty, an empty
		// Optional is returned.
		if (answer.isPresent()) {
			System.out.println(answer.get());
		} else {
			System.out.println("no value");
		}
	}
}
