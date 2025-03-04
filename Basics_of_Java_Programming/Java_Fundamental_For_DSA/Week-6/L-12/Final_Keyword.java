class B {
    final int val = 100;

    B() {

    }

    static void print() {
        // val = 10;
    }
}

public class Final_Keyword {
    public static void main(String[] args) {

        B obj = new B();
        B.print();
    }
}