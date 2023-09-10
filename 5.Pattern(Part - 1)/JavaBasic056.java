import java.util.Scanner;

public class JavaBasic056 {
    public static void main(String args[]) {
        int i,j;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        char ch = 'A';

        for(i=1; i<=n; i++) {
            for(j=1; j<=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
