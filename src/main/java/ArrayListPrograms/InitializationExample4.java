package ArrayListPrograms;

import java.util.*;

public class InitializationExample4 {
	public static void main(String args[]) {
		ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(10, 5));
		System.out.println("ArrayList items: " + intlist);
	}
}