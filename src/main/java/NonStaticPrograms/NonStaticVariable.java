package NonStaticPrograms;

// create a class name with NonStaticVariable which create non static variable which call non static method
//public class NonStaticVariable {
//    int a=10;
//    public void m1(){
//        System.out.println("Non Static Method");
//    }
//    public static void main(String[] args) {
//        NonStaticVariable obj=new NonStaticVariable();
//        System.out.println(obj.a);
//        obj.m1();
//    }
//}

// create a class name with NonStaticVariable which create non static variable which call static method
class NonStaticVariable1{
    int a=10;
    public static void m1(){
        System.out.println("Static Method");
    }
    public static void main(String[] args) {
        NonStaticVariable1 obj=new NonStaticVariable1();
        System.out.println(obj.a);
        m1();
    }
}

//// create a class name with NonStaticVariable which create static variable which call non static method
//class NonStaticVariable2{
//    static int a=10;
//    public void m1(){
//        System.out.println("Non Static Method");
//    }
//    public static void main(String[] args) {
//        System.out.println(a);
//        NonStaticVariable2 obj=new NonStaticVariable2();
//        obj.m1();
//    }
//}
//
//// create a class name with NonStaticVariable which create  static variable which call static method
//class NonStaticVariable3{
//    static int a=10;
//    public static void m1(){
//        System.out.println("Static Method");
//    }
//    public static void main(String[] args) {
//        System.out.println(a);
//        m1();
//    }
//}