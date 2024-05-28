package MethodReference;

@FunctionalInterface
interface K
{
	public abstract void m1();
}

class C
{
    public void show()
	{
		System.out.println("this implementation for m1-I");
	}
}
public class NonStaticMethodReference 
{
	public static void main(String[] args) 
	{
		K obj = new C()::show;
		obj.m1();
	}
}
