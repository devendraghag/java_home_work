package MethodOverriding;

//If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or
// no exception but cannot declare parent exception.
class Parent13 {
	void msg() throws ArithmeticException {
		System.out.println("Parent13");
	}
}

class TestExceptionChild2 extends Parent13 {
//	void msg() throws Exception {
//		System.out.println("child");
//	}

	public static void main(String args[]) {
		Parent13 p = new TestExceptionChild2();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}