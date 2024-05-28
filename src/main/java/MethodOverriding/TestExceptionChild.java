package MethodOverriding;

// If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception.
class Parent11 {
	void msg() {
		System.out.println("Parent11");
	}
}

public class TestExceptionChild extends Parent11 {
//	void msg() throws IOException {
//		System.out.println("TestExceptionChild");
//	}

	public static void main(String args[]) {
		Parent11 p = new TestExceptionChild();
		p.msg();
	}
}