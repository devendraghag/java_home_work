package DefaultMethod;

interface I
{
	default void show() // need to put default keyword or compile time error you will get
	{
		System.out.println("show method in default interface I");
	}
}

interface J
{
	default void show() // need to put default keyword or compile time error you will get
	{
		System.out.println("show method in default interface J");
	}
}

public class DefaultMethod1 implements I,J
{
	public static void main(String[] args) {
		//new DefaultMethod1().show();
//		J.show(); if method is static
//		I.show(); if method is static
	}

//	@Override
//	public void show() {                                 //if both interface having default method and both interace are implemented
//		// TODO Auto-generated method stub               // then this class have to define that show method
//		J.super.show();                                  // there are two ways one is this and seond is line number 31 to 34
//	}

	@Override
	public void show() {
		
	}
	//if we have default method then have to override show method but that not the case for static
}
