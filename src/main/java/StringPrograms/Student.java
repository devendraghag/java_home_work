package StringPrograms;

final public class Student {
	final private int id;
	final private String StudentName;
	final private Address address;
	//final private Address address = null; if you put then Student constructor wont complain
	
	public Student(int id, String studentName, Address address) {
		this.id = id;
		StudentName = studentName;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public String getStudentName() {
		return StudentName;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", StudentName=" + StudentName
				+ ", address=" + address + "]";
	}
	public Address getAddress() {
		//return address;
	//	return new Address(address.getCity(), address.getState());
		return new Address(address);
	}
}
