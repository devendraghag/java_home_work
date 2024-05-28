package ComparatorExample;

public class Employee {
	String name;
	String location;
	Double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Employee(String name, String location, Double salary) {
		super();
		this.name = name;
		this.location = location;
		this.salary = salary;
	}
}
