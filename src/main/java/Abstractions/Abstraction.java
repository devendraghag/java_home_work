package Abstractions;

abstract class AbstractClass {
    abstract void abstractMethod();
}

class ConcreteClass extends AbstractClass {
    void abstractMethod() {
        System.out.println( "Abstract Method Implemented");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        //AbstractClass A = new AbstractClass();  Can't create objects to Abstract class
        ConcreteClass C = new ConcreteClass();
        //ConcreteClass implements abstract method,
        //so we can create object to ConcreteClass
        AbstractClass A1 = C;
        //ConcreteClass object is auto-upcasted to AbstractClass
    }
}