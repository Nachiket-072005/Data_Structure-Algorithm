public class Static_Keyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Nachiket";
        System.out.println(s1.name);
        s1.schoolName = "JMV";
        System.out.println(s1.schoolName);

        Student s2 = new Student();
        System.out.println(s2.schoolName);
    }
}

// Used to share the same variables or methods
class Student {
    String name;
    int rollNo;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}