package StringPrograms;

import java.util.Objects;

public class Human {
	
	public int aadharNumber;
	public String name;

	public int getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(int aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public Human(int aadharNumber, String name) {
		this.aadharNumber = aadharNumber;
		this.name = name;
}

//@Override
//public boolean equals(Object o) {
//	if (this == o) return true;
//	if (o == null || getClass() != o.getClass()) return false;
//	Human human = (Human) o;
//	return aadharNumber == human.aadharNumber && Objects.equals(name, human.name);
//}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(aadharNumber, name);
//	}
//
////	@Override
////	public int hashCode() {
////		return this.aadharNumber;
////	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if(obj == this)
//		{
//			return true;
//		}
//		if(obj == null)
//		{
//			return false;
//		}
//		if(obj.getClass() != this.getClass())
//		{
//			return false;
//		}
//		Human anotherHuman = (Human)obj;
//		if(this.aadharNumber != anotherHuman.aadharNumber)
//		{
//			return false;
//		}
//		if(this.name == null)
//		{
//			if(anotherHuman.name != null)
//			{
//				return false;
//			}
//		}
//		if (!this.name.equals(anotherHuman.name)) {
//			return false;
//		}
//		return true;
//	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Human human = (Human) o;
		return aadharNumber == human.aadharNumber && Objects.equals(name, human.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(aadharNumber, name);
	}
}
