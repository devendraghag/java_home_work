package MethodReference;

@FunctionalInterface
interface I
{
	public abstract void m1();
}

class A
{
	static public void show()
	{
		System.out.println("this implementation for m1-I");
	}
}
public class StaticMethodReference 
{
	public static void main(String[] args) 
	{
		//with method reference
		I obj = A::show;
		obj.m1();
		//with lambda
		I obj1 = () -> System.out.println("this implementation for m1-I"); // internally method reference become lambda expression
		obj1.m1();
	}
}
