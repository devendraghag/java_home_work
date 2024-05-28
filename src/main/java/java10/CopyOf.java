package java10;

import java.util.ArrayList;
import java.util.List;

public class CopyOf {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("India");
		List<String> countryCopy = List.copyOf(countries);
		countries.add("USA"); // added
		//countryCopy.add("USA"); // unsupported exception
		System.out.println(countries);
		System.out.println(countryCopy);
    }
}
