package HashMapPrograms;

import java.util.HashMap;
public class HashMapExample6 {
	public static void main(String[] args) {
		// Creating the HashMap

		HashMap<Integer, Double> map = new HashMap<Integer, Double>();

		// Adding key-value pairs to HashMap

		map.put(1, 1.1);

		map.put(2, 2.2);

		map.put(3, 3.3);

		map.put(4, 4.4);

		// Checking whether key '3' exist in map

		System.out.println(map.containsKey(3)); // Output : true

		// Checking whether value '3.3' exist in map

		System.out.println(map.containsValue(3.3)); // Output : true
	}
}