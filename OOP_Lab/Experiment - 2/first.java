public class first {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Does every row has odd no. of 1's? " + (hasEveryRowOdd1s(matrix) ? "Yes" : "No"));
        System.out.println("Does every column has odd no. of 1's? " + (hasEveryColOdd1s(matrix) ? "Yes" : "No"));
    }

    public static boolean hasEveryRowOdd1s(int[][] m) {
        int count_1 = 0;
        boolean hasEven = false;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 1) {
                    count_1++;
                }
            }
            if (count_1 % 2 != 0) {
                hasEven = true;
            } else {
                hasEven = false;
            }
            count_1 = 0;
        }
        return hasEven;
    }

    public static boolean hasEveryColOdd1s(int[][] m) {
        int count_1 = 0;
        boolean hasEven = false;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[j][i] == 1) {
                    count_1++;
                }
            }
            if (count_1 % 2 != 0) {
                hasEven = true;
            } else {
                hasEven = false;
            }
            count_1 = 0;
        }
        return hasEven;
    }
}