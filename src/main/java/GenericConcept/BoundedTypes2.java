package GenericConcept;

/*AS THE TYPE PARAMETER WE CAN NOT PASS ANY TYPE, THERE ARE RESTRICTIONS, WE CAN BOUND TYPE PARAMETER TO A PARTICULAR 
 * PARAMETER AND RANGE BY USING EXTENDS KEYWORD, SUCH TYPES ARE CALLED BOUNDED TYPES.*/

public class BoundedTypes2 <Deva extends Runnable> { //T can replace with other as well bcz its just a identifier
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BoundedTypes2<Runnable> obj1 =
				new BoundedTypes2<Runnable>();
		BoundedTypes2<Thread> obj2 =
				new BoundedTypes2<Thread>();
//		BoundedTypes1<String> obj3 =
//				new BoundedTypes1<String>();
	}

}
