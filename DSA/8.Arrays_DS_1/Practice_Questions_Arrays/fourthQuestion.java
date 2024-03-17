public class fourthQuestion {
    public static int trapped(int height[]) {
        int n = height.length;

        int res = 0, l = 0, r = n - 1;
        int lmax = height[l], rmax = height[r];

        while (l < r) {
            if (lmax < rmax) {
                l++;
                lmax = Math.max(lmax, height[l]);
                res += lmax - height[l];
            } else {
                r--;
                rmax = Math.max(rmax, height[r]);
                res += rmax - height[r];
            }
        }
        return res;
    }

    public static void main(String args[]) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trapped(height));
    }
}