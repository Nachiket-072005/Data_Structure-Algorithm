public class Hirarcheical_Inheritance {
    public static void main(String[] args) {
        Bird b1 = new Bird();
        b1.fly();
        b1.breath();
        b1.eat();
        Fish f1 = new Fish();
        f1.swim();
        f1.breath();
        f1.eat();
        Mammal m1 = new Mammal();
        m1.walk();
        b1.breath();
        b1.eat();
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breath() {
        System.out.println("Breath");
    }
}

class Mammal extends Animal{
    void walk() {
        System.out.println("Walks");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Swims");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Fly");
    }
}