public class Que_5 {
    public static void main(String[] args) {
        Erhu e1 = new Erhu();
        Piano p1 = new Piano();
        Violin v1 = new Violin();

        e1.makeSound();
        p1.makeSound();
        v1.makeSound();
    }
}

class Instrument {
    void makeSound() {
        System.out.println("The Instrument makes beautiful sound!");
    }
}

class Erhu extends Instrument {
    void makeSound() {
        System.out.println("Erhu is good to hear");
    }
}

class Piano extends Instrument {
    void makeSound() {
        System.out.println("Piano is pleasing to ear");
    }
}

class Violin extends Instrument {
    void makeSound() {
        System.out.println("Violin is shoking");
    }
}