package MethodOverriding;

//Example in case subclass overridden method declares subclass exception
class Parent15 {
	void msg() throws Exception {
		System.out.println("Parent15");
	}
}

class TestExceptionChild4 extends Parent15 {
	void msg() throws Exception {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent15 p = new TestExceptionChild4();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}