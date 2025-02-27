public class Que_3 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(5, 2, 2, 10);
        v1.setSpeed(10);
        v1.speedUp();
        v1.move();
        v1.speedDown();
        v1.move();
    }
}

class Vehicle {
    int speed;
    int acceleration;
    int time;
    int volume;

    Vehicle(int s, int a, int t, int v) {
        speed = s;
        acceleration = a;
        time = t;
        volume = v;
    }

    void move() {
        System.out.println("Speed = " + speed);
        System.out.println("Acceleration = " + acceleration);
        System.out.println("Time = " + time);
    }

    void setSpeed(int s) {
        speed = s;
    }

    void speedUp() {
        speed = speed + acceleration * time;
        if (speed < 0) {
            speed = 0;
        }
    }

    void speedDown() {
        speed = speed - acceleration * time;
        if (speed < 0) {
            speed = 0;
        }
    }
}