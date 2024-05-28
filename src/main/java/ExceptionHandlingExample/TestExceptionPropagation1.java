package ExceptionHandlingExample;

//Rule: By default Unchecked Exceptions are forwarded in calling chain (propagated).
class TestExceptionPropagation1 {
	@SuppressWarnings("unused")
	void m() {
		int data = 50 / 0;
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (ArithmeticException e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		TestExceptionPropagation1 obj = new TestExceptionPropagation1();
		obj.p();
		System.out.println("normal flow...");
	}
}

//not match exception written
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at ExceptionHandlingExample.TestExceptionPropagation1.m(TestExceptionPropagation1.java:7)
//at ExceptionHandlingExample.TestExceptionPropagation1.n(TestExceptionPropagation1.java:11)
//at ExceptionHandlingExample.TestExceptionPropagation1.p(TestExceptionPropagation1.java:16)
//at ExceptionHandlingExample.TestExceptionPropagation1.main(TestExceptionPropagation1.java:24)
