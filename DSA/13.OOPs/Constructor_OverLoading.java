public class Constructor_OverLoading {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Nachiket");
        Student s3 = new Student(5);
        System.out.println("Name : " + s2.name);
        System.out.println("rollNo : " + s3.rollNo);
    }
}

class Student {
    String name;
    int rollNo;

    Student() {
        System.out.println("Constructor is called...");
    }
    Student(int rollNo) {
        this.rollNo = rollNo;
    }
    Student(String name) {
        this.name = name;
    }
}