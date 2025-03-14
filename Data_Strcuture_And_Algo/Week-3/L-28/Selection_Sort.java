public class Selection_Sort {
    public static void main(String[] args) {
        int[] nums = { 5, 2, 3, 4, 1 };
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int minEle = nums[i];
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < minEle) {
                    minEle = nums[j];
                    idx = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
