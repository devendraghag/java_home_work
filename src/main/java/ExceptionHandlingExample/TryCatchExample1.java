package ExceptionHandlingExample;

public class TryCatchExample1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int data = 50 / 0; // may throw exception

		System.out.println("rest of the code");

	}

}