package java11;

public class isBlankMethod {
    public static void main(String[] args)
    {
        System.out.println("".isBlank());                  //Output : true
        System.out.println("   ".isBlank());               //Output : true
        System.out.println("\t \t".isBlank());             //Output : true
        System.out.println("\n \n".isBlank());             //Output : true
        System.out.println("STRING".isBlank());            //Output : false
        System.out.println("String \t \n".isBlank());      //Output : false
    }
}
