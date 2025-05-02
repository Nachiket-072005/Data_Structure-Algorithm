class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        List<Integer> ans = new ArrayList<>();

        Queue<Integer> q = new LinkedList<>();

        int n = arr.length;
        int i = 0;

        while (i < k) {
            if (arr[i] < 0) {
                q.add(i);
            }

            i++;
        }

        while (i < n) {
            if (q.size() == 0) {
                ans.add(0);
            } else {
                ans.add(arr[q.peek()]);
            }

            while (!q.isEmpty() && q.peek() <= (i - k)) {
                q.remove();
            }

            if (arr[i] < 0) {
                q.add(i);
            }

            i++;
        }

        if (q.size() == 0) {
            ans.add(0);
        } else {
            ans.add(arr[q.peek()]);
        }

        return ans;
    }
}