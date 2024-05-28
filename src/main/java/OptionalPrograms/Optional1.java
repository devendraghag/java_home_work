package OptionalPrograms;

import java.util.Optional;

public class Optional1 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Optional<String> optional = Optional.empty(); // it will create empty optional container
		System.out.println(optional);
		
		String book = null;
		if(book != null)
		{
			System.out.println("print line");
		}
		
		optional = Optional.ofNullable(book); // of it will throw null pointerException at run time if we pass null to it that not case with offNullable
		System.out.println(optional);
		if(optional.isPresent()) //check whether the particular Optional object(or instance) is empty or no-empty.
			//ifPresent which only executes if the given Optional object is non-empty
		{
			System.out.println(optional.get().toUpperCase());
		}
		
	}
}
