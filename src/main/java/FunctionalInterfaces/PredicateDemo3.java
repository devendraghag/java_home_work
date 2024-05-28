package FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateDemo3 {
	public static void main(String[] args) {
		Predicate<Integer> predicate = (t) -> {
			if (t % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};
		//System.out.println(predicate.test(333));

		Consumer<Integer> consumer = (t) -> System.out.println("Printing value "+ t);
		List<Integer> list = Arrays.asList(1,2,3,4,5,7);
		list.stream().filter(predicate).forEach(consumer);
	}
}
