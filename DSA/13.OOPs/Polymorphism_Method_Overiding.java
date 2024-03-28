public class Polymorphism_Method_Overiding {
    public static void main(String[] args) {
        Deer d1 = new Deer();
        d1.eat();
        Animal a1 = new Animal();
        a1.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("Eats Anything");
    } 
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eats Grass");
    }
}