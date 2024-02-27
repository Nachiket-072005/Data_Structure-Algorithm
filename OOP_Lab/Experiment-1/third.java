public class third {
    public static void main(String args[]) {
        double a = 3.4, b = 50.2, e = 44.5, c = 2.1, d = 0.55, f = 5.9, x, y;
        double denominator = a * d - b * c;

        if (denominator == 0) {
            System.out.println("No Solutions");
        } else {
            x = (e * d - b * f) / denominator;
            y = (a * f - e * c) / denominator;
            System.out.println("X =  " + x);
            System.out.println("Y =  " + y);
        }

    }
}