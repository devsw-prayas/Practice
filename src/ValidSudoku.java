import java.util.LinkedHashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        int chars, falsity = 0;
        for (int i = 0; i < 9; i++) {
            chars = 0;
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    set.add(board[i][j]);
                    chars++;
                }
            }
            if(chars > set.size()) falsity++;
            set.clear();

            chars = 0;
            for(int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    set.add(board[j][i]);
                    chars++;
                }
            }
            if(chars > set.size()) falsity++;
            set.clear();
        }

        //Now check sub grids
        for(int i = 0; i < 3; i++){
            chars = 0;
            for(int j = i * 3; j < 3 + i * 3; j++){
                for(int k = i * 3; k < 3 + i * 3; k++){
                    if (board[k][j] != '.') {
                        set.add(board[k][j]);
                        chars++;
                    }
                }
            }
            if(chars > set.size()) falsity++;
            set.clear();

            chars = 0;
            for(int j = i * 3; j < 3 + i * 3; j++){
                for(int k = i * 3; k < 3 + i * 3; k++){
                    if (board[j][k] != '.') {
                        set.add(board[j][k]);
                        chars++;
                    }
                }
            }
            if(chars > set.size()) falsity++;
            set.clear();
        }
        return !(falsity > 0);
    }

    public static void main(String[] args) {
        ValidSudoku sudoku = new ValidSudoku();
        System.out.println(sudoku.isValidSudoku(new char[][]{
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        }));
        System.out.println(sudoku.isValidSudoku(new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        }));
    }
}
