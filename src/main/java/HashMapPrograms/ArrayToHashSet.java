package HashMapPrograms;

import java.util.Arrays;
import java.util.HashSet;

/*
* Java example to demonstrate how to convert an array to HashSet.
* This example uses Arrays.asList() method to perform the
* conversion. 
*/
public class ArrayToHashSet {

	public static void main(String args[]) {

// let's create an array of String
		String[] nriAccounts = { "NRE", "NRO", "FCNR", "RFC", "NRE" };

// let's convert this array to HashSet in Java
// if array contains any duplicate than that would be lost
		HashSet<String> setOfAccounts = new HashSet<>(Arrays.asList(nriAccounts));

		System.out.println("Array contains: " + Arrays.toString(nriAccounts));
		System.out.println("HashSet contains: " + setOfAccounts);

// if array contains duplicate than HashSet will have fewer
// elements than array
		System.out.println("length of array: " + nriAccounts.length);
		System.out.println("size of HashSet: " + setOfAccounts.size());

// Elements order will not be preserved when you convert an 
// array to HashSet in Java, as Set is an unordered collection.

		System.out.println("Iterating over array in Java");
		for (String account : nriAccounts) {
			System.out.println("array: " + account);
		}

		System.out.println("Iterating over HashSet in Java");
		for (String account : setOfAccounts) {
			System.out.println("hashset: " + account);
		}

	}

}