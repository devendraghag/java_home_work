package FunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierDemo1 implements Supplier<String>
{
	public static void main(String[] args) {
		SupplierDemo1 obj = new SupplierDemo1();
		System.out.println(obj.get());
	}

	@Override
	public String get() {
		return "Hello World";
	}
}
