package ClassInitialization;

class Student2 {
    int rollno;
    String name;

    void insertRecord(int r, String n) {
        rollno = r;
        name = n;
    }

    void displayInformation() {
        System.out.println(rollno + " " + name);
    }
}

class ClassInitialization2 {
    public static void main(String args[]) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
        s1.insertRecord(111, "Karan");
        s2.insertRecord(222, "Aryan");
        s1.displayInformation();
        s2.displayInformation();
    }
}  