package ObjectCreations;

public class NewInstance {
    String a = "studytonight";

    public static void main(String[] args) {
        try {
            Class b = Class.forName("NewInstance");
            NewInstance c = (NewInstance) b.newInstance();
            System.out.println(c.a);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
	