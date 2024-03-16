import java.util.Scanner;

class account {
    private int id, balance;
    private String name;

    account(int id, int balance, String name) {
        this.id = id;
        this.balance = balance;
        this.name = name;
    }

    void setData(int id, int balance, String name) {
        this.id = id;
        this.balance = balance;
        this.name = name;
    }

    void getData() {
        System.out.printf("Account ID: %d\nAccount Holder Name: %s\nBalance: %d\n", this.id, this.name, this.balance);
    }

    int getID() {
        return this.id;
    }
}

public class program_7 {
    public static void main(String[] args) {
        account a[] = new account[5];

        a[0] = new account(0, 20000000, "Cesar");
        a[1] = new account(1, 999999999, "Carl Johnson");
        a[2] = new account(2, 56000, "Officer Tempenny");
        a[3] = new account(3, 43000, "Eddie Pulaski");
        a[4] = new account(4, 3400000, "Officer Herandez");

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter an account number: ");
        int acc_no = sc.nextInt();
        boolean user_found = false;
        for (int i = 0; i < 5; i++) {
            if (a[i].getID() == acc_no) {
                a[i].getData();
                user_found = true;
            }
        }
        if (!user_found) {
            System.out.println("User not found!");
        }
        sc.close();
    }
}