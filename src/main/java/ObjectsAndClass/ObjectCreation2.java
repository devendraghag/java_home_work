package ObjectsAndClass;

//Java Program to demonstrate having the main method in
//another class  
//Creating Student class.  
class Student {
    int id;
    String name;
}

//Creating another class TestStudent1 which contains the main method  
class ObjectCreation2 {
    public static void main(String args[]) {
        Student s1 = new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}  