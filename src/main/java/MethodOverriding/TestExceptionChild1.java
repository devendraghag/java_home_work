package MethodOverriding;

//If the superclass method does not declare an exception, subclass overridden method cannot declare the 
//checked exception but can declare unchecked exception
class Parent12 {
	void msg() {
		System.out.println("Parent12");
	}
}

class TestExceptionChild1 extends Parent12 {
	void msg() throws ArithmeticException {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent12 p = new TestExceptionChild1();
		p.msg();
	}
}