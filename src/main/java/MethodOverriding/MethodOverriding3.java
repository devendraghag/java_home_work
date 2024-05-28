package MethodOverriding;

//A Simple Java program to demonstrate
//Overriding and Access-Modifiers

class Parent3 {
	// private methods are not overridden
	@SuppressWarnings("unused")
	final void m1() {
		System.out.println("From Parent3 m1()");
	}

	protected void m2() {
		System.out.println("From Parent3 m2()");
	}
}

class Child3 extends Parent3 {
	// new m1() method
	// unique to Child3 class
	@SuppressWarnings("unused")
//	private void m1() {
//		System.out.println("From Child3 m1()");   // Final methods can not be overridden
//	}

	// overriding method
	// with more accessibility
	@Override
	public void m2() {
		System.out.println("From Child3 m2()");
	}
}

//Driver class
class MethodOverriding3 {
	public static void main(String[] args) {
		Parent3 obj1 = new Parent3();
		obj1.m2();
		Parent3 obj2 = new Child3();
		obj2.m2();
	}
}