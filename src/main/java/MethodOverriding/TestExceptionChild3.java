package MethodOverriding;

//Example in case subclass overridden method declares same exception
class Parent14 {
	void msg() throws Exception {
		System.out.println("Parent14");
	}
}

class TestExceptionChild3 extends Parent14 {
	void msg() throws Exception {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent14 p = new TestExceptionChild3();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}