package GenericConcept;

import java.util.ArrayList;

public class WildCardExample2 {
	public static void main(String[] args) {
		
	}
	
	//Upper bounded wildcard syntax
	public   void methodUpperBounded(ArrayList<? extends Number> list){
	    /*                      */
	}
	
	//unbounded wildcard syntax
	public  void methodUnBounded(ArrayList<?> list){
	    /*                      */
	}
	
	//lower bounded wildcard syntax
	public   void methodLowerBounded(ArrayList<? super Runnable> list){
	    /*                      */
	}
}
