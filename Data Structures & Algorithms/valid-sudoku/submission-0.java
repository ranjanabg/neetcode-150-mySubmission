class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        //validate rows
        for (int row = 0; row < 9; row++) {
            Set<Character> seen = new HashSet<>();

            for (int i = 0; i < 9; i++) {
                if (board[row][i] == '.') {
                    continue;
                } else if (seen.contains(board[row][i])) {
                    return false;
                } else {
                    seen.add(board[row][i]);
                }
            }
        }

        //validate cols
        for (int col = 0; col < 9; col++) {
            Set<Character> seen = new HashSet<>();

            for (int i = 0; i < 9; i++) {
                if (board[i][col] == '.') {
                    continue;
                } else if (seen.contains(board[i][col])) {
                    return false;
                } else {
                    seen.add(board[i][col]);
                }
            }
        }

        //validate 3x3 boxes
        for (int square = 0; square < 9; square++) {
            Set<Character> seen = new HashSet<>();

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;

                    if (board[row][col] == '.') {
                        continue;
                    } else if (seen.contains(board[row][col])) {
                        return false;
                    } else {
                        seen.add(board[row][col]);
                    }
                }
            }
        }

        return true;

    }
}
