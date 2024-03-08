public class Floyds_Triangle {

    public static void floyds_Triangle(int n) {
        int counter = 1;
        //outer loop
        for(int i=1; i<=n; i++) {
            //inner loop -> counter print
            for(int j=1; j<=i; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        floyds_Triangle(5);
    }
}