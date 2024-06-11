class Cylinder {
    float r, h;

    public void setR(int r) {
        this.r = r;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void getR() {
        System.out.println(r);
    }

    public void getH() {
        System.out.println(h);
    }
}

public class Que_1 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.setR(5);
        c1.setH(15);
        c1.getR();
        c1.getH();
    }
}