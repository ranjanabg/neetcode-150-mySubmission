class Solution {
    public void rotate(int[][] matrix) {
        if (matrix.length == 0) {
            return;
        }

        int r = matrix.length;
        int c = matrix[0].length;

        //Transpose
        for (int i = 0; i < r; i++){
            for (int j = i + 1; j < c; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][r - j - 1];
                matrix[i][r - j - 1] = temp;
            }
        }
    }
}
