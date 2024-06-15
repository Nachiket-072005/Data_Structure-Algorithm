class A {
    int x;

    public void method1() {
        System.out.println("I am a method 1 of class A");
    }

    public void method2() {
        System.out.println("I am a method 2 of class A");
    }
}

class B extends A {
    int y;

    // Override Method
    public void method2() {
        System.out.println("I am a method 2 of class B");
    }

    public void method3() {
        System.out.println("I am a method 3 of class B");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.method2();
        B b = new B();
        b.method2();
    }
}