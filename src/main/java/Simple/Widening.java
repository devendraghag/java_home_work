package Simple;

public class Widening {
    public static void main(String[] args) {
        int a=10;
        float f=a;
        System.out.println(a);
        System.out.println(f);
        System.out.println((float) a); // inline variable
    }
}
