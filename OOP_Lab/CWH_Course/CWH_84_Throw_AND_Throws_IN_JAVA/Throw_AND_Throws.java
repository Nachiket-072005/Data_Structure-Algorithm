class NegativeRadiusException extends Exception {
    public String toString() {
        return "Radius Cannot be Negative!";
    }

    public String getMessage() {
        return "Radius Can't be Negative!";
    }
}

public class Throw_AND_Throws {
    public static double calcArea(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        double res = Math.PI * r * r;
        return res;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        try {
            int res = divide(4, 0);
            System.out.println(res);
        } catch (Exception e) {
            System.out.println("Occured Exception!!");
        }
        try {
            double ar = calcArea(-1);
            System.out.println(ar);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}