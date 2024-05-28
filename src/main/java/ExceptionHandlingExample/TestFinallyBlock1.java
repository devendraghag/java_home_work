package ExceptionHandlingExample;

class TestFinallyBlock1 {
	public static void main(String args[]) {
		try {
			int data = 25 / 0;
			System.out.println(data);
		} catch (NullPointerException e) { // correct exception Arithmetic 
	//		System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}
}

// if we put correct exception then below error without in red color
//java.lang.ArithmeticException: / by zero
//finally block is always executed
//rest of the code...


// if we put incorrect exception then below error with in red color
//finally block is always executed
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at ExceptionHandlingExample.TestFinallyBlock1.main(TestFinallyBlock1.java:6)
