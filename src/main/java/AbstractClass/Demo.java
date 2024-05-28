package AbstractClass;

public class Demo extends AbDemo{
    int a;
    int b;

    //create a constructor
    Demo(int a, int b,int i, int j){
        this.a = a;
        this.b = b;
        super.i = i;
        super.j = j;
    }

    public static void main(String[] args) {
        Demo demo = new Demo(10,20,30,40);
        System.out.println(demo.i);
        System.out.println(demo.j);
        System.out.println(demo.a);
        System.out.println(demo.b);
    }
}
