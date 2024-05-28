package NonStaticPrograms;

class A {
    int i;

    {
        i = 10;
    }

    A(int j) {
        i = j;
    }
}

class NonStaticClass {
    public static void main(String[] args) {
        A a = new A(50); // first non static block get executed then constructor assignment
        System.out.println(a.i);
    }
}