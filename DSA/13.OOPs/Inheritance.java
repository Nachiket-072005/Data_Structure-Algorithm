public class Inheritance {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.eat();
        f1.color = "Grey";
        System.out.println(f1.color);
    }
}

// Base Class
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breath() {
        System.out.println("Breaths");
    }
}

// Derived/Sub Class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims in Water");
    }
}