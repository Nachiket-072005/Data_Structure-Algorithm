interface Bicycle {
    int a = 45;

    void slow(int decrement);

    void speed(int increment);
}

interface BlowHorn {
    void blowHornk3g();

    void blowHornmhn();
}

class AvonCycle implements Bicycle, BlowHorn {
    int speed = 350;

    public void slow(int decrement) {
        speed = speed - decrement;
    }

    public void speed(int increment) {
        speed = speed + increment;
    }

    public void blowHornk3g() {
        System.out.println("Kabhi kushi kabhi gum pee pee pee...");
    }

    public void blowHornmhn() {
        System.out.println("Main hoon na po po po po....");
    }
}

public class Intro_To_Interfaces {
    public static void main(String[] args) {
        AvonCycle b1 = new AvonCycle();
        b1.slow(145);
        System.out.println(b1.speed);
        b1.speed(200);
        System.out.println(b1.speed);
        // You can create properties in interfaces
        System.out.println(b1.a);
        // You cannot modify properties in interfaces as they are final.
        // b1.a = 455;
        b1.blowHornk3g();
        b1.blowHornmhn();
    }
}