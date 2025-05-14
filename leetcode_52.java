import java.util.*;

public class leetcode_52 {

    static int ans = 0;

    public static boolean isSafe(char[][] board, int row, int col) {

        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void solveNQueensUtil(char[][] board, int row) {
        if (row == board.length) {
            ans++;
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q'; // Place queen
                solveNQueensUtil(board, row + 1); // Recur to place rest of the queens
                board[row][i] = '.'; // Backtrack
            }
        }
    }

    public static int nQueens(int n) {
        
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        solveNQueensUtil(board, 0);
        return ans;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(nQueens(n));
    }
}
