public class Que_2 {
    public static void main(String[] args) {
        final Car car = new ElectricCar();
        System.out.println(car.drive());
    }
}

class Automobile {
    private String drive() {
        return "Driving Vehicle";
    }
}

class Car extends Automobile {
    protected String drive() {
        return "Driving Car";
    }
}

class ElectricCar extends Car {
    @Override
    public final String drive() {
        return "Driving Electric Car";
    }
}