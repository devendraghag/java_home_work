package DefaultMethod;

interface I1
{
	static void show() // need to put default keyword or compile time error you will get
	{
		System.out.println("show method in default interface I");
	}
}

interface J1
{
	static void show() // need to put default keyword or compile time error you will get
	{
		System.out.println("show method in default interface J");
	}
}

public class DefaultMethod2 implements I1,J1
{
	public static void main(String[] args) {
		I1.show();
		J1.show();
	}
}
