package FinalKeyword;

//final class Bike1 {
//}
class Bike1
{
	
}

public class FinalClass extends Bike1 {
	void run() {
		System.out.println("running safely with 100kmph");
	}

	public static void main(String args[]) {
		FinalClass honda = new FinalClass();
		honda.run();
	}
}