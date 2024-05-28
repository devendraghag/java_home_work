package GenericConcept;

/*AS THE TYPE PARAMETER WE CAN NOT PASS ANY TYPE, THERE ARE RESTRICTIONS, WE CAN BOUND TYPE PARAMETER TO A PARTICULAR 
 * PARAMETER AND RANGE BY USING EXTENDS KEYWORD, SUCH TYPES ARE CALLED BOUNDED TYPES.*/

public class BoundedTypes1 <T extends Number> {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BoundedTypes1<Integer> obj1 =
				new BoundedTypes1<Integer>();
		BoundedTypes1<Double> obj2 =
				new BoundedTypes1<Double>();
//		BoundedTypes1<String> obj3 =
//				new BoundedTypes1<String>();
	}

}
