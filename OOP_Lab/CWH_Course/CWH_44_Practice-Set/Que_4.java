class Rectangle {
    private int length;
    private int breath;

    Rectangle() {
        this.length = 4;
        this.breath = 5;
    }

    Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    public void getLength() {
        System.out.println(length);
    }

    public void getBreath() {
        System.out.println(breath);
    }
}

public class Que_4 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getBreath();
        r1.getLength();

        Rectangle r2 = new Rectangle(7, 8);
        r2.getBreath();
        r2.getLength();
    }
}