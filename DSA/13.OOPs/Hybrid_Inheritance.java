public class Hybrid_Inheritance {
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
        Human h1 = new Human();
        h1.human();
        h1.eat();
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

class Dog extends Mammal {
    void dog() {
        System.out.println("Dog");
    }
}

class Cat extends Mammal {
    void cat() {
        System.out.println("Cat");
    }
}

class Human extends Mammal {
    void human() {
        System.out.println("Human");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Swims");
    }
}

class Tuna extends Fish {
    void tuna() {
        System.out.println("Tuna");
    }
}

class Shark extends Fish {
    void shark() {
        System.out.println("Shark");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Fly");
    }
}

class Peacock extends Bird{
    void peacock() {
        System.out.println("Peacock");
    }
}