class Base {
    Base() {
        System.out.println("I am a Constructor.....");
    }

    Base(int a) {
        System.out.println("I am an overloaded Constructor with value of a : " + a);
    }
}

class Derived extends Base {
    Derived() {
        // super(5);
        System.out.println("I am a Derived Class Constructor.....");
    }

    Derived(int a, int b) {
        super(a);
        System.out.println("I am an overloaded Constructor of Derived with value of b : " + b);
    }
}

class childOfDerived extends Derived {
    childOfDerived() {
        System.out.println("I am a child of Derived Constructor....");
    }

    childOfDerived(int a, int b, int c) {
        super(a, b);
        System.out.println("I am an overloaded Constructor of Derived with value of c : " + c);
    }
}

public class Constructor_In_Inheritance {
    public static void main(String[] args) {
        childOfDerived d = new childOfDerived();
        childOfDerived c = new childOfDerived(4, 5, 6);
    }
}