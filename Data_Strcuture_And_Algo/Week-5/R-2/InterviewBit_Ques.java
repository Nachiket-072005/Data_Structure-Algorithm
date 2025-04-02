public class Solution {
    public int countStudents(ArrayList<Integer> A, int pages) {
        int students = 1;
        long pagesStudents = 0;
        
        for (int i = 0; i < A.size(); i++) {
            if (pagesStudents + A.get(i) <= pages) {
                pagesStudents += A.get(i);
            }
            else {
                students += 1;
                pagesStudents = A.get(i);
            }
        }
        return students;
    }
    public int books(ArrayList<Integer> A, int B) {
        int n = A.size() - 1;
        int m = B;
        if (m > n) {
            return -1;
        }
        
        int low = Collections.max(A);
        int high = A.stream().mapToInt(Integer::intValue).sum();
        
        while(low <= high) {
            int mid = (low + high) / 2;
            int students = countStudents(A, mid);
            if (students > B) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return low;
    }
}
