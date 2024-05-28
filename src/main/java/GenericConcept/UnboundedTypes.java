package GenericConcept;

/*IF THERE IS NO RESTRICTION TO THE TYPES THAT CAN BE USED AS TYPE ARGUMENTS IN A PARAMETERIZED TYPE THEN SUCH 
 * TYPES ARE CALLED UNBOUNDED TYPES.
AS THE TYPE PARAMETER WE CAN PASS ANY TYPE.*/

public class UnboundedTypes <T> {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		UnboundedTypes<String> obj1 =
				new UnboundedTypes<String>();
		UnboundedTypes<Integer> obj2 =
				new UnboundedTypes<Integer>();
	}

}
