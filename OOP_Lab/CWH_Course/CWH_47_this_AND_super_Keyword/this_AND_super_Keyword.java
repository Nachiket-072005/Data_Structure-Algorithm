class Base {
    int x;

    Base() {
        System.out.println("I am a Constructor....");
    }

    // this is a refer to the current object
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

class Derived extends Base {
    int y;

    // super is used to refer immediate class object
    Derived() {
        super();
        System.out.println("I am a Derived Class Constructor....");
    }
}

public class this_AND_super_Keyword {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.setX(5);
        System.out.println(d.getX());
    }
}