class Student {
    private String name;
    private int marks[] = new int[3];
    private int age;

    Student(String name, int age, int[] marks) {
        this.name = name;
        this.age = age;
        this.marks[0] = marks[0];
        this.marks[1] = marks[1];
        this.marks[2] = marks[2];
    }

    public String get_name() {
        return name;
    }

    public int get_age() {
        return age;
    }

    public int getMaxMarks() {
        int max = marks[0];

        if (marks[1] >= marks[0] && marks[1] >= marks[2]) {
            max = marks[1];
        } else if (marks[2] >= marks[0] && marks[2] >= marks[1]) {
            max = marks[2];
        } else {
            max = marks[0];
        }

        return max;
    }
}

class Que_1 {
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 90;
        marks[1] = 100;
        marks[2] = 85;
        Student obj = new Student("Nachiket", 20, marks);

        System.out.println("Name: " + obj.get_name());
        System.out.println("Age: " + obj.get_age());
        System.out.println("Highest Marks: " + obj.getMaxMarks());
    }
}