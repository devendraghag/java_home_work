package MethodOverriding;

//Example in case subclass overridden method declares no exception
class Parent16 {
	void msg() throws Exception {
		System.out.println("Parent16");
	}
}

class TestExceptionChild5 extends Parent16 {
	void msg() {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent16 p = new TestExceptionChild5();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}