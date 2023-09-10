import java.util.Scanner;

public class JavaBasic054 {
    public static void main(String args[]) {
        int i,j;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        //logic 1 
        for(i=1; i<=n; i++) {
            for(j=1; j<=n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //logic 2
        // for(i=1; i<=n; i++) {
        //     for(j=4; j>=i; j--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
}
