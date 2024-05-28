package Simple;

public class TerminalOperator {
	public static void main(String[] args) {
//		int i = 5;
//		String result = i % 2 == 0 ? "a" : i % 3 == 0 ? "b" : i % 5 == 0 ? "c" : i % 7 == 0 ? "d" : "e";
//		
//		System.out.println(result);
		
//		int i = 5;
//		String result = i % 2 == 0 ? "a"
//		              : i % 3 == 0 ? "b"
//		              : i % 5 == 0 ? "c"
//		              : i % 7 == 0 ? "d"
//		              : "e";
//		System.out.println(result);
		
//		int i = 5;
//		String result = if i % 2 == 0 then "a"
//		                else if i % 3 == 0 then "b"
//		                else if i % 5 == 0 then "c"
//		                else if i % 7 == 0 then "d"
//		                else "e";
//		System.out.println(result);

		int i = 5;
		String result;
		if (i % 2 == 0) {
		    result = "a";
		} else if (i % 3 == 0) {
		    result = "b";
		} else if (i % 5 == 0) {
		    result = "c";
		} else if (i % 7 == 0) {
		    result = "d";
		} else {
		    result = "e";
		}
		
		System.out.println(result);
	}
}
