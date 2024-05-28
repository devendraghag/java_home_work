package TerminalOperatorPrograms;

//Java code for Stream.min() method to get
//the minimum element of the Stream
//according to the provided Comparator.
import java.util.*;

class MinProgram {
	//Optional<T> min(Comparator<? super T> comparator)
	// Driver code
	public static void main(String[] args) {

		// Creating a list of integers
		List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);

		// Using stream.min() to get minimum
		// element according to provided Integer Comparator
		Integer var = list.stream().min(Integer::compare).get();
		System.out.print(var);
	}
}
