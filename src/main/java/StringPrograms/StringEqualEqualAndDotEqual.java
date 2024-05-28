package StringPrograms;

public class StringEqualEqualAndDotEqual {
    public static void main(String[] args) {
//        String s1 = new String("abc");
//        String s2 = new String("abc");
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//
//        String s3 = new String("abc");
//        String s4 = new String("xyz");
//        System.out.println(s3 == s4);
//        System.out.println(s3.equals(s4));

        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 =  "abc";
        String s4 = "xyz";
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        System.out.println(s1.intern());
        System.out.println(s4.intern());

        String s5 = "pqr";
        System.out.println(s5.intern());

        String s6 = "abcde".intern();
        System.out.println(s6);

        System.out.println("devendra".intern());
    }
}
