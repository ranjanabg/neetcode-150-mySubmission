class Solution {
    public void setZeroes(int[][] matrix) {
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        List<int[]> zeroCordinates = new ArrayList<>();

        for (int r = 0; r < rowLength; r++) {
            for (int c = 0; c < colLength; c++) {
                if (matrix[r][c] == 0) {
                    zeroCordinates.add(new int[] {r, c});
                }
            }
        }


        for (int[] cordinate : zeroCordinates) {
            for (int r = 0; r < rowLength; r++) {
                matrix[r][cordinate[1]] = 0;
            }

            for (int c = 0; c < colLength; c++) {
                matrix[cordinate[0]][c] = 0;
            }
        }
    }
}
