import java.util.*;

public class fourth {
    public static void main(String[] args) {
        int arr_1[][] = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
    };
    int arr_2[][] = {
            { 10, 11, 12 },
            { 13, 14, 15 },
            { 16, 17, 18 }
    };
    Scanner sc = new Scanner(System.in);
    char op;
    System.out.printf("Enter the operator(+, -, *, /): ");
    op = sc.next().charAt(0);
    if (op == '+') {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d ", arr_1[i][j] + arr_2[i][j]);
            }
            System.out.println();
        }
    } else if (op == '-') {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d ", arr_1[i][j] - arr_2[i][j]);
            }
            System.out.println();
        }

    } else if (op == '*') {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d ", arr_1[i][j] * arr_2[i][j]);
            }
            System.out.println();
        }

    } else if (op == '/') {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d ", arr_1[i][j] / arr_2[i][j]);
            }
            System.out.println();
        }

    } else {
        System.out.println("Invalid operator.");
    }
    sc.close();
    }
}