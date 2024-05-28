package NonStaticPrograms;

class A1 {
    int i;

    {
        System.out.println("First IIB Block");
    }

    {
        System.out.println("Second IIB Block");
    }

    A1(int j) {
        this();
        System.out.println("First Constructor");
    }

    A1() { // always first default constructor call first
        System.out.println("Second Constructor");
    }
}

class NonStaticClass1 {
    public static void main(String[] args) {
        A1 a = new A1(50);
    }
}