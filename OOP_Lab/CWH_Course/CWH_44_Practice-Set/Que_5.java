class Sphere {
    float r;

    public void setR(int r) {
        this.r = r;
    }

    public void getR() {
        System.out.println(r);
    }

    public float calcArea() {
        return 4 * (float) Math.PI * r * r;
    }

    public float calcVol() {
        return ((4f/3f) * (float) Math.PI * r * r * r);
    }

}

public class Que_5 {
    public static void main(String[] args) {
        Sphere s1 = new Sphere();
        s1.setR(5);
        s1.getR();
        System.out.println(s1.calcArea());
        System.out.println(s1.calcVol());
    }
}