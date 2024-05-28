package MethodOverriding;

class Parent8 {
	void m1() {
		System.out.println("From Parent8 m1()");
	}
}

class Child8 extends Parent8 {
	void m1() {
		System.out.println("From Child8 m2()");  // method hiding concept here
	}
}

//Driver class
class MethodOverriding7 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Parent8 obj1 = new Parent8();
		obj1.m1();
		Parent8 obj2 = new Child8();
		obj2.m1();
		Child8 obj3 = new Child8();
		obj3.m1();
		
//      if we put static
//		From Parent8 m1()
//		From Parent8 m1()
//		From Child8 m2()

//		if we did not put static
//		From Parent8 m1()
//		From Child8 m2()
//		From Child8 m2()

	}
}