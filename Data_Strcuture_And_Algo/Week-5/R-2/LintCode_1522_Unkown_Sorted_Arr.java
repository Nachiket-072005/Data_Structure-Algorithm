class Solution {
    /**
     * @reader: reader.get(k) returns the element of the array at index k
     *          (0-indexed).
     * @return: return target index
     */
    public int search(ArrayReader reader, int target) {
        // write your code here
        long start = 0;
        long end = 1;

        while (start <= end) {
            if (target <= reader.get((int) end)) {
                break;
            } else {
                start = end + 1;
                end = 2 * start;
            }
        }

        while (start <= end) {
            long mid = (start + end) / 2;

            if (reader.get((int) mid) == target) {
                return (int) mid;
            } else if (reader.get((int) mid) > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}