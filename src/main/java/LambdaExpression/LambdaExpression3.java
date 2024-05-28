package LambdaExpression;

//Anonymous inner class
@FunctionalInterface
interface Transaction3 {
	public void WithDraw1(int amt);
}

public class LambdaExpression3 {
	public static void main(String[] args) {
		Transaction3 obj = (int amt) -> System.out.println("Amt WithDraw1n " + amt);
		obj.WithDraw1(1122111);
	}
}
