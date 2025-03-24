class Solution {
    // Function to count inversions in the array.
    static int merge(int start, int mid, int end, int[] arr) {
        int count = 0;
        
        List<Integer> mergeEle = new ArrayList<>();
        
        int i = start; 
        int j = mid + 1;
        
        while(i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                mergeEle.add(arr[i]);
                i++;
            } 
            else {
                mergeEle.add(arr[j]);
                count += (mid - i + 1);
                j++;
            }
        }
        
        while(i <= mid) {
            mergeEle.add(arr[i]);
            i++;
        }
        while(j <= end) {
            mergeEle.add(arr[j]);
            j++;
        }
        
        int index = 0;
        for (int k = start; k <= end; k++) {
            arr[k] = mergeEle.get(index);
            index++;
        }
        return count;
    }
    static int mergeSort(int start, int end, int arr[]) {
        // base case
        if (start == end) {
            return 0;
        }
        
        int mid = (start + end) / 2;
        // recursive case
        int leftInversion = mergeSort(start, mid, arr);
        int rightInversion = mergeSort(mid + 1, end, arr);
        int mergeInversion = merge(start, mid, end, arr);
        
        int answer = leftInversion + rightInversion + mergeInversion;
        return answer;
    }
    static int inversionCount(int arr[]) {
        // Your Code Here
        int n = arr.length;
        return mergeSort(0, n - 1, arr);
    }
}