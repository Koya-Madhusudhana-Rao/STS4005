package Backtracking;

public class MazeSolver {
    public static boolean solveMaze(int[][] maze, int row, int col) {
        int rows = maze.length;
        int cols = maze[0].length;

        if (row < 0 || col < 0 || row >= rows || col >= cols || maze[row][col] == 0) {
            return false;
        }

        if (row == rows - 1 && col == cols - 1) {
            System.out.println("Path found!");
            return true;
        }

        maze[row][col] = 0; // Mark visited
        if (solveMaze(maze, row + 1, col) || solveMaze(maze, row, col + 1)
                || solveMaze(maze, row - 1, col) || solveMaze(maze, row, col - 1)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] maze = {
                { 1, 0, 1, 1, 1 },
                { 1, 1, 1, 0, 1 },
                { 0, 0, 0, 1, 1 },
                { 0, 0, 0, 0, 1 },
                { 0, 0, 0, 0, 1 }
        };
        solveMaze(maze, 0, 0);
    }
}
