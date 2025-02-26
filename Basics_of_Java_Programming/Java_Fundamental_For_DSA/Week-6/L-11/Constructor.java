public class Constructor {

    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student(56, "ABC");

        System.out.println(obj1.marks);
        System.out.println(obj1.name);
    }
}

class Student {
    int marks;
    String name;

    public Student() {
        System.out.println("Default Constructor!");
    }

    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
        System.out.println("Parameterized Constructor!");
    }
}