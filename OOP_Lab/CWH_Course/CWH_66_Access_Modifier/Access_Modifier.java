class C1 {
    public int a = 45;
    protected int b = 50;
    int c = 65;
    private int d = 85;

    // Same Class - Accessible
    public void meth1() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class Access_Modifier {
    public static void main(String[] args) {
        C1 c = new C1();
        c.meth1();

        // Same Package - Only In Private isn't Accessible.
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
        // System.out.println(c.d);
    }
}