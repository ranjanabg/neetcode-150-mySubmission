class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int fresh = 0;
        int time = 0;
        Queue<int[]> queue = new ArrayDeque<>();


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    fresh++;
                }

                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i,j});
                }
            }
        }

        int[][] directions = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

        while (!queue.isEmpty() && fresh > 0) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();

                for(int[] dir : directions) {
                    int nextR = curr[0] + dir[0];
                    int nextC = curr[1] + dir[1];

                    if (nextR >= 0 && nextC >= 0 &&
                        nextR < m && nextC < n &&
                        grid[nextR][nextC] == 1) {

                        grid[nextR][nextC] = 2;
                        queue.offer(new int[]{nextR, nextC});
                        fresh--;
                    }
                }
            }
            time++;
        }

        return fresh == 0 ? time : -1;
    }
}
