package java11;

public class LinesMethod {
    public static void main(String[] args)
    {
        System.out.println("\n\n".lines().count());                //Output : 2
        System.out.println("abc \n xyz".lines().count());          //Output : 2
        System.out.println("123 \n 456 \n".lines().count());       //Output : 2
        System.out.println("abc \n 123 \n xyz".lines().count());   //Output : 3
    }
}
