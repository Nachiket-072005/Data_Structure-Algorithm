public class Access_Modifire {
    public static void main(String[] args) {
        BankAccount u1 = new BankAccount();
        u1.userName = "NachiketPrajapati";
        System.out.println(u1.userName);
        u1.setPassword("n@chiket");
    }
}

class BankAccount {
    public String userName;
    private String password;

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }
}