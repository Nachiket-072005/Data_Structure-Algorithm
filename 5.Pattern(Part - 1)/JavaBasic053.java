import java.util.Scanner;

public class JavaBasic053 {
    public static void main(String args[]) {
        int i,j;

        System.out.println("Enter the value of n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(i=1; i<=n; i++) {
            //one line 
            for(j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
