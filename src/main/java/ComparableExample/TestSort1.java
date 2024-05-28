package ComparableExample;

import java.util.*;

public class TestSort1 {
	public static void main(String args[]) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(1, "Vijay", 11));
		al.add(new Student(2, "Vijay", 22));
		al.add(new Student(3, "Vijay", 33));
		al.add(new Student(22, "Ajay", 1));
		al.add(new Student(22, "Ajay", 2));
		al.add(new Student(11, "Ajay", 3));
		al.add(new Student(105, "Jai", 21));
		al.add(new Student(106, "Jai", 31));
		al.add(new Student(101, "Jai", 1));

		Collections.sort(al);
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}