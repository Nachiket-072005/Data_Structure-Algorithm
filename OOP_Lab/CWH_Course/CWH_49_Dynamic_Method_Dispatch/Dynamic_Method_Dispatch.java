class Phone {
    public void greet() {
        System.out.println("Good Morning!");
    }

    public void swichOn() {
        System.out.println("Phone is turning on...");
    }
}

class SmartPhone extends Phone {
    public void swagat() {
        System.out.println("Apka Swagat Hai....");
    }

    public void swichOn() {
        System.out.println("SmartPhone is turning on...");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        // It is valid
        // Phone p1 = new Phone();
        // SmartPhone p2 = new SmartPhone();
        Phone p3 = new SmartPhone();
        // It isn't valid
        // SmartPhone p4 = new Phone();

        p3.greet();
        p3.swichOn();
        // p3.swagat(); // It will give an error
    }
}