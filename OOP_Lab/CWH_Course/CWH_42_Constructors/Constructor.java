class Employee {
    private int id;
    private String name;
    private int salary;

    // Default Constructor
    Employee() {
        System.out.println("Constructor is called...");
    }

    Employee(int salary) {
        this.salary = salary;
    }

    // Parametrized Constructor
    Employee(int i, String name) {
        this.id = i;
        this.name = name;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(2, "Rudra");
        Employee e3 = new Employee(35000);

        e1.setId(1);
        System.out.println(e1.getId());
        e1.setName("Nachiket");
        System.out.println(e1.getName());
        System.out.println(e2.getId());
        System.out.println(e2.getName());
        System.out.println(e3.getSalary());
    }
}