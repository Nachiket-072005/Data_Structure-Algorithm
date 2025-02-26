public class Static_Function {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.marks = 85;
        obj.name = "ABC";
        Student.printMarks();
        obj.printName();
        Student obj1 = new Student();
        obj1.name = "DEF";
        obj1.marks = 95;
        Student.printMarks();
        obj1.printName();
    }
}

class Student {
    static int marks;
    String name;

    public void printName() {
        System.out.println(name);
    }

    static public void printMarks() {
        System.out.println(marks);
    }
}
