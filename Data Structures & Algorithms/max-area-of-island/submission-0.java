class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int maxArea = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && visited[i][j] != true) {
                    maxArea = Math.max(maxArea, matrixdfs(grid, i, j, visited, 1));
                }
            }
        }

        return maxArea;
    }

    private int matrixdfs(int[][] grid, int i, int j, boolean[][] visited, int currArea) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || visited[i][j] || grid[i][j] == 0) {
            return 0;
        }
        visited[i][j] = true;

       return 1 + matrixdfs(grid, i + 1, j, visited, currArea) + 
                matrixdfs(grid, i - 1, j, visited, currArea) +
                matrixdfs(grid, i, j + 1, visited, currArea) +
                matrixdfs(grid, i, j - 1, visited, currArea);

    }
}
