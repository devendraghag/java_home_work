package TerminalOperatorPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectProgram {

	public static void main(String[] args) {

		List<String> listOfString = Arrays.asList("Java", "C", "C++", "Go", "JavaScript", "Python", "Scala");
		System.out.println("input list of String: " + listOfString);

		// Example 1 - converting Stream to List using collect() method
		List<String> listOfStringStartsWithJ = listOfString.stream().filter(s -> s.startsWith("J"))
				.collect(Collectors.toList());

		System.out.println("list of String starts with letter J: " + listOfStringStartsWithJ);

		// Example 2 - converting Stream to Set
		Set<String> setOfStringStartsWithC = listOfString.stream().filter(s -> s.startsWith("C"))
				.collect(Collectors.toSet());

		System.out.println("set of String starts with letter C: " + setOfStringStartsWithC);

		// Example 3 - converting Stream to Map
		Map<String, Integer> stringToLength = listOfString.stream()
				.collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println("map of string and their length: " + stringToLength);

		// Example - Converting Stream to Collection e.g. ArrayList
		ArrayList<String> stringWithLengthGreaterThanTwo = listOfString.stream().filter(s -> s.length() > 2)
				.collect(Collectors.toCollection(ArrayList::new));
		System.out.println("collection of String with length greather than 2: " + stringWithLengthGreaterThanTwo);

	}
}

//https://www.java67.com/2018/06/java-8-streamcollect-example.html