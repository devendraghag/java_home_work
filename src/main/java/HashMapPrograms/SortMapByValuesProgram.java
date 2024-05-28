package HashMapPrograms;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapByValuesProgram {
	public static void main(String[] args) {
		// Define one HashMap called idNameMap

		Map<Integer, String> idNameMap = new HashMap<Integer, String>();

		// Insert Id-Name pairs into idNameMap

		idNameMap.put(111, "Lisa");
		idNameMap.put(222, "Narayan");
		idNameMap.put(333, "Xiangh");
		idNameMap.put(444, "Arunkumar");
		idNameMap.put(555, "Jyous");
		idNameMap.put(666, "Klusener");

		// Get listOfEntry through entrySet() method

		List<Entry<Integer, String>> listOfEntry = new LinkedList<>(idNameMap.entrySet());

		// Sort listOfEntry using Collections.sort() by passing customized Comparator

		Collections.sort(listOfEntry, new Comparator<Entry<Integer, String>>() {
			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		// Insert all elements of listOfEntry into new LinkedHashMap which maintains
		// insertion order

		Map<Integer, String> sortedIdNameMap = new LinkedHashMap<Integer, String>();

		for (Entry<Integer, String> entry : listOfEntry) {
			sortedIdNameMap.put(entry.getKey(), entry.getValue());
		}

		// Print idNameMap before and after sorting

		System.out.println("Before Sorting : ");

		System.out.println(idNameMap);

		System.out.println("After Sorting : ");

		System.out.println(sortedIdNameMap);
	}
}