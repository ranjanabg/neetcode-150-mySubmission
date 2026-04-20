class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, i, j, visited, 0, word)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }


    private static boolean dfs(char[][] board, int i, int j, boolean[][] visited, int index, String word) {
        if (index >= word.length()) {
            return true;
        }

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || board[i][j] != word.charAt(index)) {
            return false;
        }

        visited[i][j] = true;

        boolean found = dfs(board, i , j + 1, visited, index + 1, word) || dfs(board, i , j - 1, visited, index + 1, word) ||
                        dfs(board, i + 1 , j, visited, index + 1, word) || dfs(board, i - 1, j, visited, index + 1, word);

        visited[i][j] = false;

        return found;

    }
}
