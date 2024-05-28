package StaticPrograms;

//Java Program to illustrate the use of static variable which
//is shared with all objects.  
class StaticVariable2 {
    static int count = 0;//will get memory only once and retain its value

    StaticVariable2() {
        count++;//incrementing the value of static variable
        System.out.println(count);
    }

    public static void main(String args[]) {
//creating objects  
        StaticVariable2 c1 = new StaticVariable2();
        StaticVariable2 c2 = new StaticVariable2();
        StaticVariable2 c3 = new StaticVariable2();
    }
}  