package FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo3
{
	public static void main(String[] args) {
		Supplier<String> demo =
				() -> "hello World";
		
		List<String> list = Arrays.asList();
		List<String> list1 = Arrays.asList("a","b","c");
		System.out.println(list.stream().findAny().orElseGet(demo));
		System.out.println(list1.stream().findAny().orElseGet(demo));
	}
}
