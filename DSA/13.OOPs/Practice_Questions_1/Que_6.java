public class Que_6 {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        //ERROR
        // obj1.print1();
        
        Vehicle obj2 = new Vehicle();
        obj2.print();
    }
}

class Vehicle {
    void print() {
        System.out.println("Base Class(Vehicle)");
    }
}

class Car extends Vehicle {
    void print1() {
        System.out.println("Derived Class(Car)");
    }
}