package ArrayListPrograms;

import java.util.*;

public class InitializationExample1 {
	public static void main(String args[]) {
		ArrayList<String> obj = new ArrayList<String>(Arrays.asList("Pratap", "Peter", "Harsh"));
		System.out.println("Elements are:" + obj);
	}
}