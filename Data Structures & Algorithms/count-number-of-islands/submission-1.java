class Solution {
    public int numIslands(char[][] grid) {
        int numOfIslands = 0;

        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && visited[i][j] != true) {
                    matrixdfs(grid, i, j, visited);
                    numOfIslands++;
                }
            }
        }

        return numOfIslands;
    }

    private static void matrixdfs(char[][] grid, int i, int j, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || visited[i][j] || grid[i][j] == '0') {
            return;
        }

        visited[i][j] = true;

        matrixdfs(grid, i, j + 1, visited);
        matrixdfs(grid, i, j - 1, visited);
        matrixdfs(grid, i + 1, j, visited);
        matrixdfs(grid, i - 1, j, visited);
    }
}
