class A {
    int val = 10;

    A() {
        System.out.println("A constructor");
    }

    void print() {
        System.out.println("Print A function");
    }
}

class B extends A {
    B() // by default A constructor
    {
        // super(); (IT CAN BE WRITTEN IN CONSTRUCTOR)
        // System.out.println(super.val);
        // super.print();

        // super --> child variable/function
    }

    void abc() {
        System.out.println(super.val);
        super.print();
    }
}

public class Constructor_Basic {
    public static void main(String[] args) {

        B obj = new B();
        obj.abc();
    }
}