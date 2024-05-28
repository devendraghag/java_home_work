package ExceptionHandlingExample;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            System.out.println("I am java developer"); // this will print only
            int c = 10/0;
            System.out.println("Result "+ c);
        }
        finally {
            System.out.println("I am inside the finally"); // this will print only
        }
        System.out.println("After finally");
        System.out.println("last line of program");
    }
}
