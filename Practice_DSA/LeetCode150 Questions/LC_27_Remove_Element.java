public class LC_27_Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[idx] = nums[i];
                idx++;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        int val = 3;
        
        System.out.println(removeElement(arr, val));
    }
}
