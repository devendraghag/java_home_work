package GenericConcept;

public class GenericExample1 {
	public static void main(String[] args) {
		//to provide type safe and to resolve type casting problem we use generic's
		
		//Array are type safe where collection classes are not type safe
		String str [] = new String [1000];
		str[0] = "abc";
		str[2] = "xyz";
		System.out.println(str[1]); // it will store null and str.tostring or str will will print hash code only
		
		//String toString method as below
//	    public String toString() {
//	        return this;
//	    }
		
		//System.out.println(str[33334]); // java.lang.ArrayIndexOutOfBounds
		//str[1] = new Integer(11); compile time error bcz array are type safe
		str[1] = null; // we need to choose array when we have fix size and type is fixed
		
	}
}
