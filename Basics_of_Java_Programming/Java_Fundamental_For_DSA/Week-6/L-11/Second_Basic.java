public class Second_Basic {
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.setSpeed(56);
        c1.setnumberOfTyers(4);

        System.out.println(c1.getSpeed());
        System.out.println(c1.getNumberOfTyers());
    }
}

class Car {
    private int speed;
    private int numberOfTyers;

    public void setSpeed(int s) {
        this.speed = s;
    }

    public void setnumberOfTyers(int t) {
        this.numberOfTyers = t;
    }

    public int getSpeed() {
        return speed;
    }

    public int getNumberOfTyers() {
        return numberOfTyers;
    }
}