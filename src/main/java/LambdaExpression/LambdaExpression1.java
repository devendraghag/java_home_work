package LambdaExpression;

interface Transaction
{
	public void withDraw(int amt);
}

class WithDraw implements Transaction
{
	@Override
	public void withDraw(int amt) 
	{
		System.out.println("Amt withdrawn "+amt);
	}
	
}
public class LambdaExpression1 
{
	public static void main(String[] args) 
	{
		WithDraw obj = new WithDraw();
		obj.withDraw(11111);
	}
}
