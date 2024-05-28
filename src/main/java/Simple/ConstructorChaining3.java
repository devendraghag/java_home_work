package Simple;

// Java program to illustrate Constructor Chaining to
// other class using super() keyword
class Base {
    String name;

    // constructor 1
    Base() {
        this("");
        System.out.println("No-argument constructor of" + " base class");
    }

    // constructor 2
    Base(String name) {
        this.name = name;
        System.out.println("Calling parameterized constructor" + " of base");
    }
}

public class ConstructorChaining3 extends Base {
    // constructor 3
    ConstructorChaining3() {
        System.out.println("No-argument constructor " + "of ConstructorChaining3");
    }

    // parameterized constructor 4
    ConstructorChaining3(String name) {
        // invokes base class constructor 2
        super(name);
        System.out.println("Calling parameterized " + "constructor of ConstructorChaining3");
    }

    @SuppressWarnings("unused")
    public static void main(String args[]) {
        // calls parameterized constructor 4
        ConstructorChaining3 obj = new ConstructorChaining3("test");

        // Calls No-argument constructor
        // ConstructorChaining3 obj = new ConstructorChaining3();
    }
}