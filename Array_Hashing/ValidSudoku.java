package Array_Hashing;
import java.util.HashSet;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
            // 9 rows, 9 columns, 9 boxes
            HashSet<Character>[] rows = new HashSet[9];
            HashSet<Character>[] cols = new HashSet[9];
            HashSet<Character>[] boxes = new HashSet[9];

            for (int i = 0; i < 9; i++) {
                rows[i] = new HashSet<>();
                cols[i] = new HashSet<>();
                boxes[i] = new HashSet<>();
            }

            for (int r = 0; r < 9; r++) {
                for (int c = 0; c < 9; c++) {
                    char val = board[r][c];

                    if (val == '.') continue; // skip empty cells

                    // Check row
                    if (rows[r].contains(val)) return false;
                    rows[r].add(val);

                    // Check column
                    if (cols[c].contains(val)) return false;
                    cols[c].add(val);

                    // Check 3x3 box
                    int boxIndex = (r / 3) * 3 + (c / 3);
                    if (boxes[boxIndex].contains(val)) return false;
                    boxes[boxIndex].add(val);
                }
            }

            return true;
        }

        public static void main(String[] args) {
            // Example input board
            char[][] board = {
                    {'5','3','.','.','7','.','.','.','.'},
                    {'6','.','.','1','9','5','.','.','.'},
                    {'.','9','8','.','.','.','.','6','.'},
                    {'8','.','.','.','6','.','.','.','3'},
                    {'4','.','.','8','.','3','.','.','1'},
                    {'7','.','.','.','2','.','.','.','6'},
                    {'.','6','.','.','.','.','2','8','.'},
                    {'.','.','.','4','1','9','.','.','5'},
                    {'.','.','.','.','8','.','.','7','9'}
            };

            boolean result = isValidSudoku(board);
            System.out.println("Is the board valid? " + result);
    }

}
//36. Valid Sudoku

//Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

//Each row must contain the digits 1-9 without repetition.
//Each column must contain the digits 1-9 without repetition.
//Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
//Note:

//A Sudoku board (partially filled) could be valid but is not necessarily solvable.
//Only the filled cells need to be validated according to the mentioned rules.

//Constraints:
//board.length == 9
//board[i].length == 9
//board[i][j] is a digit 1-9 or '.'.