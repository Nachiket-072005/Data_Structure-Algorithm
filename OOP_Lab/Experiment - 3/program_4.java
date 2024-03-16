import java.util.Scanner;

class employee {
    private String name;
    private int salary;

    employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void putData() {
        System.out.printf("Name: %s\nSalary: %d\n", name, salary);
    }

    void getData(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class program_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employee e1 = new employee("Tommy Vercetti", 120000);
        e1.putData();
        String name;
        int salary;
        System.out.printf("Enter the name of employee: ");
        name = sc.nextLine();
        System.out.printf("Enter the salary: ");
        salary = sc.nextInt();
        e1.getData(name, salary);
        e1.putData();
        sc.close();
    }
}
