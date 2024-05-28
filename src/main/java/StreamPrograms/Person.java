package StreamPrograms;

/**
 * Person.java This entity class is used in collection
 * 
 * @author www.codejava.net
 *
 */
public class Person implements Comparable<Person> {
	private String firstName;
	private String lastName;
	private String email;
	private Gender gender;
	private int age;

	public Person() {
	}

	public Person(String firstName, String lastName, String email,
			Gender gender, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Gender getGender() {
		return this.gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public int compareTo(Person another) {
		return this.age - another.getAge();
	}

	public String toString() {
		return this.firstName + " " + this.lastName;
	}
}