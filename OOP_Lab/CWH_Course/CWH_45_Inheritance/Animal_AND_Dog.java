class Animal {
    String color;

    public void eat() {
        System.out.println("Eat the food");
    }

    public void walk() {
        System.out.println("Walkk.......");
    }
}

class Dog extends Animal {
    public void setColor(String c) {
        this.color = c;
    }

    public String getColor() {
        return color;
    }
}

public class Animal_AND_Dog {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setColor("Cream");
        System.out.println(d1.getColor());
        d1.walk();
        d1.eat();
    }
}