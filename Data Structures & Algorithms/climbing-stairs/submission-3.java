class Solution {
    public int climbStairs(int n) {
        int[] possibleWays = new int[n + 1];
        possibleWays[0] = 1;
        possibleWays[1] = 2; 

        for (int i = 2; i < n; i++) {
            possibleWays[i] = possibleWays[i - 1] + possibleWays[i - 2];
        }

        return possibleWays[n - 1];
    }
}
