class CellPhone {
    void ring() {
        System.out.println("Ringingggg.....");
    }

    void vibrate() {
        System.out.println("Vibratingggg.....");
    }
}

public class Que_2 {
    public static void main(String[] args) {
        CellPhone c1 = new CellPhone();
        c1.ring();
        c1.vibrate();
    }
}