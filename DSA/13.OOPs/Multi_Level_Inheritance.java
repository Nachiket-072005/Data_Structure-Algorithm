public class Multi_Level_Inheritance {
    // Multi Level Inheritance
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.leg = 4;
        System.out.println(d1.leg);
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breath() {
        System.out.println("Breaths");
    }
}

class Mammal extends Animal {
    int leg;
}

class Dog extends Mammal {
    String breeds;
}