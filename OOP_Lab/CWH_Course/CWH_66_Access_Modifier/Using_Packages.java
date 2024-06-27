import com.packages.ex_1.Ex_1;

class Using extends Ex_1 {
    // Subclass in Different Package
    void meth2() {
        System.out.println(a);
        System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);
    }

}

public class Using_Packages {
    public static void main(String[] args) {
        System.out.println("I am using the packages.");
        Ex_1 c = new Ex_1();
        Using d = new Using();
        // World Scenario
        System.out.println(c.a);
        // System.out.println(c.b);
        // System.out.println(c.c);
        d.meth2();
    }
}