import java.util.HashSet;

public class ValidSuduko {

    public static boolean validSudoko(char[][] sudoko) {

        for (int row = 0; row < 9; row++) {
            HashSet<Character> s1 = new HashSet<>();

            for (int i = 0; i < 9; i++) {

                if (sudoko[row][i] == '.') {
                    continue;
                }

                if (s1.contains(sudoko[row][i])) {
                    return false;
                }

                s1.add(sudoko[row][i]);
            }
        }

        for (int col = 0; col < 9; col++) {
            HashSet<Character> s1 = new HashSet<>();

            for (int i = 0; i < 9; i++) {

                if (sudoko[i][col] == '.') {
                    continue;
                }

                if (s1.contains(sudoko[i][col])) {
                    return false;
                }

                s1.add(sudoko[i][col]);
            }
        }

 
        for (int sqr = 0; sqr < 9; sqr++) {

            HashSet<Character> s1 = new HashSet<>();

            for (int i = 0; i < 3; i++) {

                for (int j = 0; j < 3; j++) {

                    int row = (sqr / 3) * 3 + i;
                    int col = (sqr % 3) * 3 + j;

                    if (sudoko[row][col] == '.') {
                        continue;
                    }

                    if (s1.contains(sudoko[row][col])) {
                        return false;
                    }

                    s1.add(sudoko[row][col]);
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        char[][] sudoku = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        System.out.println(validSudoko(sudoku));
    }
}