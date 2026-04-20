class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int curr = 0;

        for (int i = 0; i < nums.length; i++) {
            curr = Math.max(curr, 0);
            curr += nums[i];

            maxSum = Math.max(maxSum, curr);
        }

        return maxSum;
    }
}
