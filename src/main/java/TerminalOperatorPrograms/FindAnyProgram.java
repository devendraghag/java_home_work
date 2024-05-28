package TerminalOperatorPrograms;

//Java code for Stream findAny()
//which returns an Optional describing
//some element of the stream, or an
//empty Optional if the stream is empty.
import java.util.*;

class FindAnyProgram {

	// Driver code
	//Optional<T> findAny()
	public static void main(String[] args)
	{

		// Creating a List of Integers
		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

		// Using Stream findAny() to return
		// an Optional describing some element
		// of the stream
		Optional<Integer> answer = list.stream().findAny();

		// if the stream is empty, an empty
		// Optional is returned.
		if (answer.isPresent()) {
			System.out.println(answer.get());
		}
		else {
			System.out.println("no value");
		}
	}
}
