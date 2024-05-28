package StringPrograms;

public class ImmutableClass {

	public static void main(String[] args) {
		Address address = new Address("Maharashtra", "Mumbai");
		Student student1 = new Student(1,"Abc",address);
		System.out.println(student1);
		System.out.println(address);
		Address add = student1.getAddress();
		add.setCity("Kalyan");
		add.setState("Maharashtra");
		System.out.println(student1);
		System.out.println(add.toString());

	}
}
