public class fourthQuestion {
    // Given in solution of this question :-

    // public static int trapped(int height[]) {
    //     int n = height.length;

    //     int res = 0, l = 0, r = n - 1;
    //     int lmax = height[l], rmax = height[r];

    //     while (l < r) {
    //         if (lmax < rmax) {
    //             l++;
    //             lmax = Math.max(lmax, height[l]);
    //             res += lmax - height[l];
    //         } else {
    //             r--;
    //             rmax = Math.max(rmax, height[r]);
    //             res += rmax - height[r];
    //         }
    //     }
    //     return res;
    // }

    public static int trappedRainwater(int height[]) {
        int n = height.length;
        //To calc leftMax boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]   );
        } 

        //To calc rightMax boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        //loop
        for(int i=0; i<n; i++) {
            //waterLevel = min(leftMax boundary, rightMax boundary) 
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            //trappedWater += WaterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String args[]) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        // System.out.println(trapped(height));
        System.out.println(trappedRainwater(height));
    }
}