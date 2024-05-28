package Simple;

// Java program to illustrate Constructor Chaining
// within same class Using this() keyword
// and changing order of constructors
class ConstructorChaining2 {
    // default constructor 1
    ConstructorChaining2() {
        System.out.println("default");
    }

    // parameterized constructor 2
    ConstructorChaining2(int x) {
        // invokes default constructor
        this();
        System.out.println(x);
    }

    // parameterized constructor 3
    ConstructorChaining2(int x, int y) {
        // invokes parameterized constructor 2
        this(5);
        System.out.println(x * y);
    }

    public static void main(String args[]) {
        // invokes parameterized constructor 3
        new ConstructorChaining2(8, 10);
    }
}