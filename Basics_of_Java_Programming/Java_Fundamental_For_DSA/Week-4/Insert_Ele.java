import java.util.Scanner;

public class Insert_Ele {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int answer[] = new int[n + 1];

        int position = in.nextInt();
        int ele = in.nextInt();

        int i = 0;
        int j = 0;

        while (i < n + 1) {
            if (i == position - 1) {
                answer[i] = ele;
            } else {
                answer[i] = arr[j];
                j++;
            }
            i++;
        }

        i = 0;

        while (i < n + 1) {
            System.out.print(answer[i] + " ");
            i++;
        }

        in.close();
    }
}