public class Que_6 {
    public static void main(String[] args) {
        Water w1 = new Water();
        w1.getName();
        w1.DrinkFeeling();

        Milk m1 = new Milk();
        m1.getName();
        m1.DrinkFeeling();
    }
}

interface Drinks {
    void getName();

    void DrinkFeeling();
}

class Water implements Drinks {
    public void getName() {
        System.out.println("Water");
    }

    public void DrinkFeeling() {
        System.out.println("Water is awesome");
    }
}

class Milk implements Drinks {
    public void getName() {
        System.out.println("Milk");
    }

    public void DrinkFeeling() {
        System.out.println("Milk is healthy");
    }
}