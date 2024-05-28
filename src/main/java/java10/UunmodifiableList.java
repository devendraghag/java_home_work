package java10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Example shows how to use copyOf method in a List.
public class UunmodifiableList {
	public static void main(String[] args) {

		List<String> countries = new ArrayList<>();
		countries.add("India");
		List<String> countryView = Collections.unmodifiableList(countries);
//		//Results in UnsupportedOperationException
//		// countryView.add("Denmark");
//
		countries.add("USA");
		System.out.println("usingUnmodifiableView Original - " + countries);
		System.out.println("usingUnmodifiableView UnmodifiableList - " + countryView);
	}
}