public class Hollow_Rectangle{

    public static void hollow_Rectangle(int totRows, int totCols) {
        //outer loop
        for(int i=1; i<=totRows; i++) {
            //inner cols
            for(int j=1; j<=totCols; j++) {
                //boundary cells
                if( i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
    public static void main(String args[]) {
        hollow_Rectangle(4, 5);
    }
}