public class JavaBasic052 {
    public static void main(String args[]) {
         for(int i=0; i<=5; i++) {
            System.out.println("i = " + i);
         }
         int i = 0;
         System.out.println("i after the loop = " + i);

         /*
         * Scope of variable is referred to the part of the program where the variable
         * can be used.
         * In this program variable i is declared in the for loop. So scope of variable
         * i is limited to the for
         * loop only that is between { and } of the for loop. There is a display
         * statement after the for loop
         * where variable i is used which means i is used out of scope. This leads to
         * compilation errors.
         * The program given will not run and give an error instead. To correct the
         * program, the variable i
         * needs to be declared outside the for loop.
         */
    }
}
