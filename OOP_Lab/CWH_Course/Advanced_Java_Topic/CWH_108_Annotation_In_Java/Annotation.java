class Phone {
    public void showTime() {
        System.out.println("Time is 8 am");
    }

    public void on() {
        System.out.println("Turning on Phone...");
    }
}

@FunctionalInterface
interface myFunctionalInterface {
    void method();
}

class SmartPhone extends Phone {
    public void music() {
        System.out.println("Playing music...");
    }

    @Override
    public void showTime() {
        System.out.println("Time is 8 pm");
    }

    public void on() {
        System.out.println("Turning on SmartPhone...");
    }

    @Deprecated
    public int sum(int a, int b) {
        return a + b;
    }
}

public class Annotation {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        // Used to provide extra information about a program.
        // Annotation provides metadata to class/method.

        SmartPhone obj = new SmartPhone(); // Yes it is allowed
        // SmartPhone obj2 = new Phone(); // Not allowed

        obj.showTime();
        obj.on();
        // obj.music(); Not Allowed
        System.out.println(obj.sum(4, 5));

    }
}