public class Basic_OOP {

    public static void main(String[] args) {
        Student obj = new Student();
        obj.marks = 85;
        obj.name = "ABC";

        System.out.println(obj.marks);
        System.out.println(obj.name);
    }
}

class Student {
    int marks;
    String name;
}