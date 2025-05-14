import java.util.*;

public class leetcode_51 {

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

    public static void solveNQueensUtil(char[][] board, int row, List<List<String>> result) {
        if (row == board.length) {
            List<String> stringList = new ArrayList<>();
            for (char[] r : board) {
                stringList.add(new String(r));
            }

            result.add(stringList);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q'; // Place queen
                solveNQueensUtil(board, row + 1, result); // Recur to place rest of the queens
                board[row][i] = '.'; // Backtrack
            }
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        solveNQueensUtil(board, 0, result);
        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> result = solveNQueens(n);
        // for (List<String> board : result) {
        // for (String row : board) {
        // System.out.println(row);
        // }
        // System.out.println();
        // }
        System.out.println(result);
    }
}
