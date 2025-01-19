import java.util.Scanner;

class Que_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char c = in.next().charAt(0);
        int n = in.nextInt();

        System.out.println("Character: " + c);
        System.out.println("Number: " + n);

        in.close();
    }
}