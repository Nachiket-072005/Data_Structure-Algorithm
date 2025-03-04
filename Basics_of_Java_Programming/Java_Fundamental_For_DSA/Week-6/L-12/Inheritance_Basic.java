public class Inheritance_Basic {
    public static void main(String[] args) {
        BMW c1 = new BMW();

        c1.bmwPrint();
        c1.print();
        System.out.println(c1.tyre);
        System.out.println(c1.speed);
    }
}

class Car {
    int tyre = 4;
    int speed = 100;

    Car() {

    }

    void print() {
        System.out.println("Car Class");
    }
}

class BMW extends Car {
    BMW() {

    }

    void bmwPrint() {
        System.out.println("BMW Class");
    }
}