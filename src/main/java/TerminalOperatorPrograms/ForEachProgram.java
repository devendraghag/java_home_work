package TerminalOperatorPrograms;

//Java code for forEach
//(Consumer action) in Java 8
import java.util.*;

class ForEachProgram {
	//void forEach(Consumer<? super T> action)
	// Driver code
	public static void main(String[] args) {

		// Creating a list of Integers
		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

		// Using forEach(Consumer action) to
		// print the elements of stream
		// in reverse order
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		list.stream().forEach(System.out::println);
		list.stream().forEachOrdered(System.out::println);
	}
}
