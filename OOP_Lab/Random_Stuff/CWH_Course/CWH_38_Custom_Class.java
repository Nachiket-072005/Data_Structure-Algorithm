class Employee {
    int id;
    String name;
    int salary;

    public void printDetails() {
        System.out.println("My id is : " + id);
        System.out.println("My name is : " + name);
        System.out.println("My salary is : " + salary);
    }
}

public class CWH_38_Custom_Class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        // Instantiating a new Employee Object
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.id = 1;
        e1.name = "Nachiket";
        e1.salary = 35000;
        e1.printDetails();

        e2.id = 2;
        e2.name = "Rudra";
        e2.salary = 15000;
        e2.printDetails();
    }
}