package FunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierDemo2
{
	public static void main(String[] args) {
		Supplier<String> demo =
				() -> "hello World";
		System.out.println(demo.get());
	}
}
