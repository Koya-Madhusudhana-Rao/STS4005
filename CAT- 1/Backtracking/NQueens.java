package Backtracking;
public class NQueens {
    public static void solveNQueens(int n) {
        int[] placement = new int[n];
        placeQueens(placement, 0, n);
    }

    public static void placeQueens(int[] placement, int row, int n) {
        if (row == n) {
            printSolution(placement);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isValid(placement, row, col)) {
                placement[row] = col;
                placeQueens(placement, row + 1, n);
            }
        }
    }

    public static boolean isValid(int[] placement, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (placement[i] == col || Math.abs(placement[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    public static void printSolution(int[] placement) {
        for (int col : placement) {
            for (int i = 0; i < placement.length; i++) {
                if (i == col) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 4;
        solveNQueens(n);
    }
}
