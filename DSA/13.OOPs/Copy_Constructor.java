public class Copy_Constructor {
        public static void main(String[] args) {
            Student s1 = new Student( "Nachiket", 4);
            Student s2 = new Student("Nachiket");
            Student s3 = new Student(5);
            System.out.println("Name : " + s2.name);
            System.out.println("rollNo : " + s3.rollNo);
            s1.marks[0] = 100;
            s1.marks[1] = 95;
            s1.marks[2] = 86;

            Student s4 = new Student(s1);
            s1.marks[2] = 100;
            for(int i=0; i<3; i++) {
                System.out.println(s4.marks[i]); 
            }
        }
    }
    
    class Student {
        String name;
        int rollNo;
        String password;
        int marks[];

        Student(Student s1) {
            marks = new int[3];
            this.name = s1.name;
            this.rollNo = s1.rollNo;
            this.marks = s1.marks;
        }

        Student(String name, int rollNo) {
            System.out.println("Constructor is called...");
            this.name = name;
            this.rollNo = rollNo;
        }
        Student(int rollNo) {
            this.rollNo = rollNo;
        }
        Student(String name) {
            this.name = name;
        }
    }