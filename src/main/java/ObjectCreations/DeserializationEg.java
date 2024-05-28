package ObjectCreations;

import java.io.*;

class DeserializationEg implements Serializable {
    private String a;

    DeserializationEg(String name) {
        this.a = a;
    }

    public static void main(String[] args) {
        try {
            DeserializationEg b = new DeserializationEg("studytonight");
            FileOutputStream c = new FileOutputStream("CoreJava.txt");
            ObjectOutputStream d = new ObjectOutputStream(c);
            d.writeObject(b);
            d.close();
            d.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

		