package java17;

//Shows example of sealed classes and conversions.
interface I {
}

sealed class C permits D, E {
}

non-sealed class D extends C {
}

final class E extends C {
}

class App {
    public static void main(String[] args) {
        App app = new App();
    }

    public void test(C c) {
        if (c instanceof I) {
            System.out.println("C is a type of I");
        }
    }
}
