public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        // System.out.println("Name : " + s1.name);
        // System.out.println("rollNo : " + s1.rollNo);
    }
}

class Student {
    String name;
    int rollNo;

    Student() {
        // this.name = name;
        // this.rollNo = rollNo;
        System.out.println("Constructor is called...");
    }
}