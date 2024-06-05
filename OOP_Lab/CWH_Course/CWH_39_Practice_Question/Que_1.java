class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }
}

public class Que_1 {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.setName("Nachiket");
        e1.salary = 35000;
        System.out.println(e1.getSalary());
        System.out.println(e1.getName());
    }
}