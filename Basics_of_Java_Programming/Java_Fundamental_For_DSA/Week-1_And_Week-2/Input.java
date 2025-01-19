import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // ClassName obj = new ClassName();
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        System.out.println(a);
        float b = in.nextFloat();
        System.out.println(b);
        String c = in.next();
        System.out.println(c);
        char d = in.next().charAt(0);
        System.out.println(d);
        double e = in.nextDouble();
        System.out.println(e);
        // & Many More!
        in.close();
    }
}
