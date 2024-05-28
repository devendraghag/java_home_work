package ObjectCreations;

import java.lang.reflect.*;

public class ReflectionEg {
    private String s;

    ReflectionEg() {
    }

    public void setName(String s) {
        this.s = s;
    }

    public static void main(String[] args) {
        try {
            Constructor constructor = ReflectionEg.class.getDeclaredConstructor();
            ReflectionEg r = (ReflectionEg) constructor.newInstance();
            r.setName("studytonight");
            System.out.println(r.s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
		