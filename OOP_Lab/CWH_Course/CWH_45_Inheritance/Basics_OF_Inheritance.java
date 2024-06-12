class Base {
    int x;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

class Derived extends Base {
    int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

public class Basics_OF_Inheritance {
    public static void main(String[] args) {
        Derived b = new Derived();
        b.setX(4);
        b.setY(5);
        System.out.println(b.getX());
        System.out.println(b.getY());
    }
}