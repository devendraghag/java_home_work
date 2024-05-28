package HashMapPrograms;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample11 {
	public static void main(String[] args) {
		// Creating the HashMap

		HashMap<String, String> map = new HashMap<String, String>();

		// Adding key-value pairs to HashMap

		map.put("ONE", "AAA");

		map.put("TWO", "BBB");

		map.put("THREE", "CCC");

		map.put("FOUR", "DDD");

		map.put("FIVE", "EEE");

		// Retrieving the Set consists of all key-value pairs in map

		Set<Entry<String, String>> keyValueSet = map.entrySet();

		for (Entry<String, String> entry : keyValueSet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}