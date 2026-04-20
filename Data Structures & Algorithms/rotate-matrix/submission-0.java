class Solution {
    public void rotate(int[][] matrix) {
        // Transpose
        int row = matrix.length;
        int col = matrix[0].length;
        for (int r = 0; r < row; r++) {
            for (int c = r + 1; c < col; c++) {
                int temp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = temp;
            }
        }

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col / 2; c++) {
                int temp = matrix[r][c];
                matrix[r][c] = matrix[r][col - c - 1];
                matrix[r][col - c - 1] = temp;
            }
        }
    }
}
