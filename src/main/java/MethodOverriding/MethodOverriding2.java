package MethodOverriding;

//A Simple Java program to demonstrate
//Overriding and Access-Modifiers

class Parent2 {
	// private methods are not overridden
	@SuppressWarnings("unused")
	private void m1() {
		System.out.println("From Parent2 m1()");
	}

	protected void m2() {
		System.out.println("From Parent2 m2()");
	}
}

class Child2 extends Parent2 {
	// new m1() method
	// unique to Child2 class
	@SuppressWarnings("unused")
	private void m1() {
		System.out.println("From Child2 m1()");
	}

	// overriding method
	// with more accessibility
	@Override
	public void m2() {
		System.out.println("From Child2 m2()");
	}
}

//Driver class
class MethodOverriding2 {
	public static void main(String[] args) {
		Parent2 obj1 = new Parent2();
		obj1.m2();
		Parent2 obj2 = new Child2();
		obj2.m2();
	}
}