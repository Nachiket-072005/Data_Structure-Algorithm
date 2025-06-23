public class Solution {
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
        int n = A.size();
        int m = B.size();

        Collections.sort(A);
        Collections.sort(B);

        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder()); // max-heap
        Set<PairIndex> seen = new HashSet<>();

        int i = n - 1, j = m - 1;
        pq.add(new Pair(A.get(i) + B.get(j), i, j));
        seen.add(new PairIndex(i, j));

        ArrayList<Integer> res = new ArrayList<>();

        while (C > 0 && !pq.isEmpty()) {
            Pair top = pq.poll();
            res.add(top.sum);
            C--;

            i = top.i;
            j = top.j;

            if (i > 0 && !seen.contains(new PairIndex(i - 1, j))) {
                pq.add(new Pair(A.get(i - 1) + B.get(j), i - 1, j));
                seen.add(new PairIndex(i - 1, j));
            }

            if (j > 0 && !seen.contains(new PairIndex(i, j - 1))) {
                pq.add(new Pair(A.get(i) + B.get(j - 1), i, j - 1));
                seen.add(new PairIndex(i, j - 1));
            }
        }

        return res;
    }

    // Custom class for priority queue
    static class Pair implements Comparable<Pair> {
        int sum, i, j;

        Pair(int sum, int i, int j) {
            this.sum = sum;
            this.i = i;
            this.j = j;
        }

        @Override
        public int compareTo(Pair other) {
            return Integer.compare(this.sum, other.sum);
        }
    }

    // Custom class for (i, j) indexing in the seen set
    static class PairIndex {
        int i, j;

        PairIndex(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof PairIndex)) return false;
            PairIndex other = (PairIndex) obj;
            return this.i == other.i && this.j == other.j;
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, j);
        }
    }
}