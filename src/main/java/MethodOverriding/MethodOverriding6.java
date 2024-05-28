package MethodOverriding;

class Parent7 {
//	void m1() {
//		System.out.println("From Parent7 m1()");
//	}
}

class Child7 extends Parent7 {
	static void m1() {
		System.out.println("From Child7 m2()");  // static you can not put here or put static parent class
	}
}

//Driver class
class MethodOverriding6 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Parent7 obj1 = new Parent7();
		Parent7 obj2 = new Child7();
	}
}