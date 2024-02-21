package Backtracking;
public class WarnsdorffsAlgorithm {
    public static void findKnightTour(int n, int startRow, int startCol) {
        int[][] chessboard = new int[n][n];
        int[] rowMoves = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int[] colMoves = { 1, 2, 2, 1, -1, -2, -2, -1 };
        chessboard[startRow][startCol] = 1;
        knightTour(chessboard, startRow, startCol, 1, rowMoves, colMoves);
        printSolution(chessboard);
    }

    public static boolean knightTour(int[][] chessboard, int row, int col, int move, int[] rowMoves, int[] colMoves) {
        if (move == chessboard.length * chessboard.length) {
            return true;
        }
        for (int i = 0; i < rowMoves.length; i++) {
            int newRow = row + rowMoves[i];
            int newCol = col + colMoves[i];
            if (isValidMove(chessboard, newRow, newCol)) {
                chessboard[newRow][newCol] = move + 1;
                if (knightTour(chessboard, newRow, newCol, move + 1, rowMoves, colMoves)) {
                    return true;
                }
                chessboard[newRow][newCol] = 0; // Backtrack
            }
        }
        return false;
    }

    public static boolean isValidMove(int[][] chessboard, int row, int col) {
        return row >= 0 && row < chessboard.length && col >= 0 && col < chessboard.length
                && chessboard[row][col] == 0;
    }

    public static void printSolution(int[][] chessboard) {
        for (int[] row : chessboard) {
            for (int cell : row) {
                System.out.printf("%2d ", cell);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int startRow = 0, startCol = 0;
        findKnightTour(n, startRow, startCol);
    }
}
