package LambdaExpression;

//Anonymous inner class
interface Transaction1 {
	public void WithDraw1(int amt);
}

public class LambdaExpression2 {
	public static void main(String[] args) {
		Transaction1 obj = new Transaction1() {
			@Override
			public void WithDraw1(int amt) {
				System.out.println("Amt WithDraw1n " + amt);
			}

		};
		obj.WithDraw1(1122111);
	}
}
