public class Palindromic_Pattern_With_Numbers {

    public static void palindromic_Pattern(int n) {
        //outer loop
        for(int i=1; i<=n; i++) {
            //inner loop
            //spaces
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            //numbers
            //descending order
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }

            //ascending order
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
    public static void main(String args[]) {
        palindromic_Pattern(8);
    }
}
