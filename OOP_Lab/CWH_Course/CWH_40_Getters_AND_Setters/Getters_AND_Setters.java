class MyEmployee {
    private int id;
    private String name;

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class Getters_AND_Setters {
    public static void main(String[] args) {
        MyEmployee e1 = new MyEmployee();

        // Throws an error due to private access modifier
        // e1.id = 1;
        // e1.name = "Nachiket";

        e1.setId(1);
        System.out.println(e1.getId());
        e1.setName("Nachiket");
        System.out.println(e1.getName());
    }
}