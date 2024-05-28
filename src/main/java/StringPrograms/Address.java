package StringPrograms;

public class Address {
	
	private String state;
	private String city;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String state, String city) {
		super();
		this.state = state;
		this.city = city;
	}
	
	public Address(Address address) {
		this(address.getState(),address.getCity());
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + "]";
	}
	
}
