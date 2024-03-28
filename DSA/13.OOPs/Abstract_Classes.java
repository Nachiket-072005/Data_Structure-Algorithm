public class Abstract_Classes {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);
        // h.changeColor();
        // System.out.println(h.color);
        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
        Mustang myHorse = new Mustang();    
    }
}

abstract class Animal {
    String color;

    Animal() {
        // color = "brown";
        System.out.println("Animal Constructor called");
    }

    void eat() {
        System.out.println("Animal Eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse Constructor called");
    }

    void changeColor() {
        color = "Dark-Brown";
    }

    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustange Constructor called");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "Yellow";
    }

    void walk() {
        System.out.println("Walks on 2 legs");
    }
}