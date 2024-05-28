package MethodOverriding;

class Parent6 {
	static void m1() {
		System.out.println("From Parent6 m1()");
	}
}

class Child6 extends Parent6 {
//	void m1() {
//		System.out.println("From Child6 m2()");  // static you have to put
//	}
}

//Driver class
class MethodOverriding5 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Parent6 obj1 = new Parent6();
		obj1.m1();
		Parent6 obj2 = new Child6();
		obj2.m1();
	}
}