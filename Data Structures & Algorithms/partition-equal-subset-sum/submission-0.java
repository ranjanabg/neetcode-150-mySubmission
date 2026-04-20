class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for (int n : nums) total += n;

        // If total sum is odd → cannot partition equally
        if (total % 2 != 0) return false;

        int target = total / 2;

        // dp[s] = can we make sum s?
        boolean[] dp = new boolean[target + 1];
        dp[0] = true; // sum 0 always possible

        // Fill DP
        for (int num : nums) {
            for (int s = target; s >= num; s--) {
                dp[s] = dp[s] || dp[s - num];
            }
        }

        return dp[target];
    }
}
