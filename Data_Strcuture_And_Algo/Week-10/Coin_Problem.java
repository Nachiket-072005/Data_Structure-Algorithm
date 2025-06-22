public class Coin_Problem {
    public static void main(String[] args) {
        int k = 1270;
        int arr[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };

        int coin = 0;

        int i = arr.length - 1;

        while (i >= 0) {
            if (k >= arr[i]) {
                int q = k / arr[i];
                k -= (q * arr[i]);

                coin += q;
            }
            i--;
        }

        System.out.println("Total Coin Required to complete k value: " + coin);
    }
}
