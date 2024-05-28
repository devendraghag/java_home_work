package StringPrograms;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class EqualsAndHashCode {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

//		Human human1 = new Human(1, "Rahul");
//		Human human2 = new Human(1, "Rahul");
//		System.out.println(human1.equals(human2));
//		System.out.println(human1 == human2);
//
//		Human human3 = new Human(2, "Rahul2");
//		Human human4 = new Human(1, "Rahul");
//		System.out.println(human3.equals(human4));
//		System.out.println(human3 == human4);


//		Human human1 = new Human(1, "Rahul");
//		Human human2 = new Human(1, "Rahul");
//		System.out.println(human1.equals(human2));
//		System.out.println(human1 == human2);
//
//		Human human3 = new Human(2, "Rahul2");
//		Human human4 = new Human(1, "Rahul");
//		System.out.println(human3.equals(human4));
//		System.out.println(human3 == human4);

		String str1 = new String("Rahul");;
		String str2 = new String("Rahul");
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);

		String str3 = new String("Rahul3");;
		String str4 = new String("Rahul");
		System.out.println(str3.equals(str4));
		System.out.println(str3==str4);


		Integer int1 = Integer.valueOf(1);
		Integer int2 = Integer.valueOf(1);
		System.out.println(int1.equals(int2));
		System.out.println(int1==int2);

		Integer int3 = Integer.valueOf(4);
		Integer int4 = Integer.valueOf(1);
		System.out.println(int3.equals(int4));
		System.out.println(int3==int4);

	}
}
