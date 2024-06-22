interface Base {
    void meth1();

    void meth2();
}

interface Derived extends Base {
    void meth3();

    void meth4();
}

class MySampleClass implements Derived {
    public void meth3() {
        System.out.println("Method 3");
    }

    public void meth4() {
        System.out.println("Method 4");
    }

    public void meth1() {
        System.out.println("Method 1");
    }

    public void meth2() {
        System.out.println("Method 2");
    }

}

public class Inhritance_In_Interfaces {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}