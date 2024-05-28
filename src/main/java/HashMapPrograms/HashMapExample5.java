package HashMapPrograms;

import java.util.HashMap;

public class HashMapExample5 {
	public static void main(String[] args) {
		// Creating HashMap with default initial capacity and load factor

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		// Adding key-value pairs to HashMap

		map.put("ONE", 1);

		map.put("TWO", 2);

		map.put("THREE", 3);

		map.put("FOUR", 4);

		// Retrieving a value associated with key 'TWO'

		int value = map.get("TWO");

		System.out.println(value); // Output : 2
	}
}