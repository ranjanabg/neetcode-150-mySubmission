class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];

        if (n <= 3) {
            return n;
        }

        if (memo[n] > 0) {
            return memo[n];
        }

        memo[n] = climbStairs(n - 1) + climbStairs(n - 2);

        return memo[n];

    }
}
