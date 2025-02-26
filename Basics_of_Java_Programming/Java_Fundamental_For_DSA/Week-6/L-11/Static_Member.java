public class Static_Member {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.marks = 85;
        obj.name = "ABC";
        Student obj1 = new Student();
        obj1.name = "DEF";
        obj1.marks = 95;
        System.out.println(obj.marks);
        System.out.println(obj.name);
        System.out.println(obj1.marks);
        System.out.println(obj1.name);
    }
}

class Student {
    static int marks;
    String name;
}
