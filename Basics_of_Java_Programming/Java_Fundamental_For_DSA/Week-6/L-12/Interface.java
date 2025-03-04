class A {
    int val = 10;

    A() {
    }

    void print() {
        System.out.println("Print A function");
    }
}

class B extends A {
    B() // by default A constructor
    {
    }

    void print() {
        super.print();
        System.out.println("Print B function");
    }
}

public class Interface {
    public static void main(String[] args) {

        B obj = new B();
        obj.print();
    }
}
