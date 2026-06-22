
import java.util.HashSet;
import java.util.Set;

public class ValidSuduko {
    public static boolean isValid(char board[][]) {
        for (int row = 0; row < 9; row++) {
            Set s1 = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (board[row][i] == '.') {
                    continue;
                }
                if (s1.contains(board[row][i])) {
                    return false;
                }
                s1.add(board[row][i]);
            }
        }

        for (int col = 0; col < 9; col++) {
            Set s1 = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (board[i][col] == '.') {
                    continue;
                }
                if (s1.contains(board[i][col])) {
                    return false;
                }
                s1.add(board[i][col]);
            }
        }
        for (int sqr = 0; sqr < 9; sqr++) {
            Set s1 = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (sqr / 3) * 3 + i;
                    int col = (sqr % 3) * 3 + j;
                    if (board[row][col] == '.') {
                        continue;
                    }
                    if (s1.contains(board[row][col])) {
                        return false;
                    }
                    s1.add(board[row][col]);
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '8', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '5', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        boolean result = isValid(board);
        if (result) {
            System.out.println(" Sudoku board is valid.");
        } else {
            System.out.println(" Sudoku board is invalid.");
        }
    }
}
