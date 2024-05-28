package JoinPrograms;

import java.util.Arrays;
import java.util.List;

public class Java8StringJoinMethod3 {
	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		String joinedString = String.join(" | ", listOfStrings);
		System.out.println(joinedString);
	}
}