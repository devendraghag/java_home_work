package StaticPrograms;

class StaticComponents {
    static int staticVariable;

    static {
        System.out.println("StaticComponents SIB :" + staticVariable);
        staticVariable = 10;
    }

    static void staticMethod() {
        System.out.println("From StaticMethod");
        System.out.println(staticVariable);
    }
}

public class SIB_Variable_Method {
    static {
        System.out.println("MainClass SIB");
    }

    public static void main(String[] args) {
        //Static Members directly accessed with Class Name
        StaticComponents.staticVariable = 20;
        StaticComponents.staticMethod();
    }
}