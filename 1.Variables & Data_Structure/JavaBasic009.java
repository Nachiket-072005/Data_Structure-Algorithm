/* Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
these 3 numbers.
(Hint : Average of N numbers is sum of those numbers divided by N)
 */
import java.util.*;

public class JavaBasic009 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float b = sc.nextFloat();
        float a = sc.nextFloat();
        float c = sc.nextFloat();

        float avg = (a + b + c)/3;
        System.out.println(avg);
    }
}
