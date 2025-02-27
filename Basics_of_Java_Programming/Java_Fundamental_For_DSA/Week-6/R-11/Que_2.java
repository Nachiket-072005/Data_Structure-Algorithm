public class Que_2 {
    public static void main(String[] args) {
        Student obj1 = new Student();
        Student obj2 = new Student();
        Teacher obj3 = new Teacher();
        Teacher obj4 = new Teacher();

        System.out.println(SchoolMemeber.number);
    }
}

class SchoolMemeber {
    String name;
    static int number;

    SchoolMemeber() {

    }
}

class Teacher extends SchoolMemeber {
    int salary;

    Teacher() {
        number++;
    }

    public int getSalary() {
        return salary;
    }
}

class Student extends SchoolMemeber {
    Student() {
        number++;
    }
}