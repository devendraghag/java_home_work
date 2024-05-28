package FinalKeyword;

//Yes, final method is inherited but you cannot override it.
class Bike {
	final void run() {
		System.out.println("running");
	}
}

public class FinalMethod extends Bike {
//	void run() {
//		System.out.println("running safely with 100kmph");
//	}

	public static void main(String args[]) {
		FinalMethod FinalMethod = new FinalMethod();
		FinalMethod.run();
	}
}