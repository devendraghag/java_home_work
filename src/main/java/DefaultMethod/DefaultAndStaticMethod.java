package DefaultMethod;

interface MyInterface {
    default void defaultMethod1() {
        System.out.println("Default Method from interface");
    }

    static void staticMethod1() {
        System.out.println("Static Method from interface");
        //This can not be overriden from interface method
    }

    void abstractMethod1();
}

public class DefaultAndStaticMethod implements MyInterface {
    public static void main(String[] args) {
        new DefaultAndStaticMethod().defaultMethod1();
        new DefaultAndStaticMethod().abstractMethod1();
        DefaultAndStaticMethod.staticMethod1();
        MyInterface.staticMethod1();
    }

    @Override
    public void defaultMethod1() {
        System.out.println("Default Method inside class....");
        //This can be overriden from interface method
    }

    @Override
    public void abstractMethod1() {
        System.out.println("abstract Method inside class....");
    }

    static void staticMethod1() { // method hiding we can call as well.
        System.out.println("Static Method from Class");
    }
}
