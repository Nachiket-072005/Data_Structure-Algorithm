import java.util.*;

public class avg_of_three {

    public static void calcAvg(int a, int b, int c) { //formal parameter & parameter
        int avg = (a + b + c)/3;
        System.out.println("Avg = " + avg);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        calcAvg(a, b, c); //actual parameter & arguments
    }
}