public class Diagonal_Sum {
        public static int diagonalSum(int matrix[][]) {
            int sum = 0;
    
            for(int i=0; i<matrix.length; i++) {
                //Primary Diagonal Sum
                sum += matrix[i][i];
                //Secondary Diagonal Sum
                if(i != matrix.length - 1 -i)
                    sum += matrix[i][matrix.length-1-i];
            }
            return sum;
        }
        public static void main(String[] args) {
            int matrix[][] = { { 1, 2, 3, 4 },
                               { 5, 6, 7, 8 },
                               { 9, 10, 11, 12 },
                               { 13, 14, 15, 16 } };
            int sum = diagonalSum(matrix);
            System.out.println("Sum is : " + sum);
        }
}