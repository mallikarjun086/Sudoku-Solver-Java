import java.util.Scanner;

public class SudokuSolver {

    private static final int SIZE = 9;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] board = new int[SIZE][SIZE];

        System.out.println("Enter Sudoku Grid (use 0 for empty cells):");

        // Input
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                board[i][j] = scanner.nextInt();

        System.out.println("\nInput Sudoku:");
        printBoard(board);

        long start = System.currentTimeMillis();

        if (solve(board)) {
            long end = System.currentTimeMillis();
            System.out.println("\nSolved Sudoku:");
            printBoard(board);
            System.out.println("\nSolved in " + (end - start) + " ms");
        } else {
            System.out.println("No solution exists.");
        }

        scanner.close();
    }

    // ================= BACKTRACKING =================
    private static boolean solve(int[][] board) {

        int[] empty = findEmpty(board);

        // No empty cell → solved
        if (empty == null)
            return true;

        int row = empty[0];
        int col = empty[1];

        for (int num = 1; num <= 9; num++) {

            if (isValid(board, row, col, num)) {

                board[row][col] = num;

                if (solve(board))
                    return true;

                // Backtrack
                board[row][col] = 0;
            }
        }
        return false;
    }

    // ================= FIND EMPTY CELL =================
    private static int[] findEmpty(int[][] board) {

        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (board[i][j] == 0)
                    return new int[]{i, j};

        return null;
    }

    // ================= VALID CHECK =================
    private static boolean isValid(int[][] board, int row, int col, int num) {

        // Row & Column check together (optimized)
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == num || board[i][col] == num)
                return false;
        }

        // 3x3 Box
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++)
            for (int j = startCol; j < startCol + 3; j++)
                if (board[i][j] == num)
                    return false;

        return true;
    }

    // ================= PRINT =================
    private static void printBoard(int[][] board) {

        for (int i = 0; i < SIZE; i++) {

            if (i % 3 == 0 && i != 0)
                System.out.println("-----------------------");

            for (int j = 0; j < SIZE; j++) {

                if (j % 3 == 0 && j != 0)
                    System.out.print("| ");

                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}