import java.util.Scanner;

public class Pass_By_Ref {
    public static void func(int a, int arr[]) {
        System.out.println(arr.length);
        a = a + 1;
        arr[1] = 1000;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[3];
        int a = 10;
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        func(a, arr);
        System.out.println(a);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        in.close();
    }
}
