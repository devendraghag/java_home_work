package MethodReference;

@FunctionalInterface
interface J
{
	public abstract void m1();
}

class B
{
	B()
	{
		System.out.println("this implementation for m1-I");
	}
}

public class ConstructorMethodReference 
{
	public static void main(String[] args) 
	{
		J obj = B::new;
		obj.m1();
	}
}
