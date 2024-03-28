public class Multiple_Inheritance_Interfaces {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eat_veg();
        b.eat_meat();
    }
}

interface Herbivore {
    void eat_veg();
}

interface Carnivore {
    void eat_meat();
}

class Bear implements Herbivore, Carnivore {
    public void eat_veg() {
        System.out.println("Eats Vegetables");
    }

    public void eat_meat() {
        System.out.println("Eats Meat");
    }
}