package MethodOverriding;

class Parent4 {
	void m1() {
		System.out.println("From Parent4 m1()");
	}
}

class Child4 extends Parent4 {
	void m1() {
		System.out.println("From Child4 m2()");
	}
}

//Driver class
class MethodOverriding4 {
	public static void main(String[] args) {
		Parent4 obj1 = new Parent4();
		obj1.m1();
		Parent4 obj2 = new Child4();
		obj2.m1();
	}
}