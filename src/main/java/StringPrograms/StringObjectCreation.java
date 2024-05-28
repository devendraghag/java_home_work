package StringPrograms;

public class StringObjectCreation {
	public static void main(String[] args) {
		String s1 = new String ("Java");
		String s2 = new String ("Java");
		String s3 = s2;
		String s4 = "Java";
		String s5 = new String ("Java").intern();//it will make s5 object as SCP ie cached type, it will make s4 and s5 same
		
//		System.out.println(s1.hashCode());//2301506
//		System.out.println(s2.hashCode());//2301506
//		System.out.println(s3.hashCode());//2301506
//		System.out.println(s4.hashCode());//2301506
//		System.out.println(s5.hashCode());//2301506
//		
//		System.out.println(s1.intern().hashCode());//2301506
//		System.out.println(s2.intern().hashCode());//2301506
//		System.out.println(s3.intern().hashCode());//2301506
//		System.out.println(s4.intern().hashCode());//2301506
//		System.out.println(s5.intern().hashCode());//2301506
		
//		System.out.println(s1.toString());//java
//		System.out.println(s2.toString());//java
//		System.out.println(s3.toString());//java
//		System.out.println(s4.toString());//java
//		System.out.println(s5.toString());//java
//		
//		System.out.println(s1.intern().toString());//java
//		System.out.println(s2.intern().toString());//java
//		System.out.println(s3.intern().toString());//java
//		System.out.println(s4.intern().toString());//java
//		System.out.println(s5.intern().toString());//java
		
//		System.out.println(s1==s1);//true
//		System.out.println(s1==s2);//false
//		System.out.println(s1==s3);//false
//		System.out.println(s1==s4);//false
//		System.out.println(s1==s5);//false
		
//		System.out.println(s2==s1);//false
//		System.out.println(s2==s2);//true
//		System.out.println(s2==s3);//true
//		System.out.println(s2==s4);//false
//		System.out.println(s2==s5);//false
	
		System.out.println(s3==s1);//false
		System.out.println(s3==s2);//true
		System.out.println(s3==s3);//true
		System.out.println(s3==s4);//false
		System.out.println(s3==s5);//false
		
//		System.out.println(s4==s1);//false
//		System.out.println(s4==s2);//false
//		System.out.println(s4==s3);//false
//		System.out.println(s4==s4);//true// it we remove intern method then it will become false else its true
//		System.out.println(s4==s5);//true
		
//		System.out.println(s5==s1);//false
//		System.out.println(s5==s2);//false
//		System.out.println(s5==s3);//false
//		System.out.println(s5==s4);//true // it we remove intern method then it will become false else its true
//		System.out.println(s5==s5);//true
	}
}