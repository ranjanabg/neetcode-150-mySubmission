class Solution {
    public void islandsAndTreasure(int[][] grid) {
        final Queue<int[]> queue = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
                
            int i = current[0];
            int j = current[1];

            for (int[] dir : directions) {
                int nextR = i + dir[0];
                int nextC = j + dir[1];

                if (nextR < 0 || nextC < 0 || nextR >= grid.length || nextC >= grid[0].length || grid[nextR][nextC] == -1) {
                continue;

                }

                int distance = grid[i][j];

                if (grid[nextR][nextC] > distance) {
                    grid[nextR][nextC] = distance + 1;
                    queue.offer(new int[]{nextR, nextC});
                }
            }

        }
    }
}
