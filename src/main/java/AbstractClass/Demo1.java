package AbstractClass;

public class Demo1 extends AbDemo{
    int x;
    int y;

    //create parameterized constructor
    Demo1(int x, int y,int i, int j){
        this.x = x;
        this.y = y;
        super.i = i;
        super.j = j;
    }
}
