class Solution {
    public int[][] updateMatrix(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int level[][] = new int[n][m];

        Queue<ArrayList<Integer>> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    level[i][j] = 0;
                    ArrayList<Integer> cur = new ArrayList<Integer>();
                    cur.add(i);
                    cur.add(j);
                    q.add(cur);
                } else {
                    level[i][j] = -1;
                }
            }
        }

        while (!q.isEmpty()) {
            ArrayList<Integer> d = q.remove();
            int r = d.get(0);
            int c = d.get(1);

            // DOWN
            if (r + 1 < n && arr[r + 1][c] == 1) {
                arr[r + 1][c] = 0;
                level[r + 1][c] = level[r][c] + 1;
                ArrayList<Integer> cur = new ArrayList<>();
                cur.add(r + 1);
                cur.add(c);
                q.add(cur);
            }

            // UP
            if (r - 1 >= 0 && arr[r - 1][c] == 1) {
                arr[r - 1][c] = 0;
                level[r - 1][c] = level[r][c] + 1;
                ArrayList<Integer> cur = new ArrayList<>();
                cur.add(r - 1);
                cur.add(c);
                q.add(cur);
            }

            // RIGHT
            if (c + 1 < m && arr[r][c + 1] == 1) {
                arr[r][c + 1] = 0;
                level[r][c + 1] = level[r][c] + 1;
                ArrayList<Integer> cur = new ArrayList<>();
                cur.add(r);
                cur.add(c + 1);
                q.add(cur);
            }

            // LEFT
            if (c - 1 >= 0 && arr[r][c - 1] == 1) {
                arr[r][c - 1] = 0;
                level[r][c - 1] = level[r][c] + 1;
                ArrayList<Integer> cur = new ArrayList<>();
                cur.add(r);
                cur.add(c - 1);
                q.add(cur);
            }
        }

        return level;
    }
}   