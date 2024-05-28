package StringPrograms;

public class HashCodeTest {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Human human1 = new Human(1, "abc");
		int hashcode1 = human1.hashCode();
		System.out.println(human1.equals(null));
		System.out.println(hashcode1);
		
		Human human2 = new Human(2, "abc");
		int hashcode2 = human2.hashCode();// Human class hashCode method, that we can edit as per our requirement or java also provide default imp
		System.out.println(hashcode2);
		
		Human human3 = new Human(3, "abc");
		int hashcode3 = human3.hashCode();// object class hashCode calculation we do not know as it native method
		System.out.println(hashcode3); // hash code is calculated by some number then pre processing on that and give you hash code
		
		String str1 = new String("ac");
		int hashcode4 = str1.hashCode();//String class hashCode imp is different
		//FB and Ea having same hashCode
	}
}
