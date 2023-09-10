import java.util.Scanner;

public class JavaBasic055 {
    public static void main(String args[]) {
        int i,j;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        for(i=1; i<=n; i++) {
            //print numbers
            for(j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
