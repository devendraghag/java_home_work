package ComparableExample;

class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

//	public int compareTo(Student st) {
//		if (age == st.age)
//			return 0;
//		else if (age > st.age)
//			return 1;
//		else
//			return -1;
//	}

//	public int compareTo(Student st) {
//		if (rollno == st.rollno)
//			return 0;
//		else if (rollno > st.rollno)
//			return 1;
//		else
//			return -1;
//	}

	// Java String already implements Comparable. So you could simply write your
	// method as
//	public int compareTo(Student other)
//	{
//	    return this.name.compareTo(other.name);
//	}

	public int compareTo(Student other) {
		int i = name.compareTo(other.name);
		if (i != 0)
			return i;

		i = Integer.compare(age, other.age);
		if (i != 0)
			return i;
		return Integer.compare(rollno, other.rollno);
	}
}