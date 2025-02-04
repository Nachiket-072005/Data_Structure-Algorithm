import java.util.Scanner;

public class Find_First_AND_Second_Small {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int minE = (int) (1e9);
        int sminE = (int) (1e9);

        for (int i = 0; i < n; i++) {
            if (minE > arr[i]) {
                sminE = minE;
                minE = arr[i];
            } else if (arr[i] > minE && sminE > arr[i]) {
                sminE = arr[i];
            }
        }

        System.out.println("First Smallest Element : " + minE);
        System.out.println("Second Smallest Element : " + sminE);
        in.close();
    }
}