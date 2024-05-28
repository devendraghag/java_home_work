package ObjectCreations;

public class CloneEg implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    String s = "studytonight";

    public static void main(String[] args) {
        CloneEg a = new CloneEg();
        try {
            CloneEg b = (CloneEg) a.clone();
            System.out.println(b.s);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
	