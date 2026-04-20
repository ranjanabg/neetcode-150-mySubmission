class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE;
        int currentMax = 0;

        for (int i = 0; i < nums.length; i++) {
            currentMax += nums[i];

            if (maxSoFar < currentMax) {
                maxSoFar = currentMax;
            }

            if (currentMax < 0) {
                currentMax = 0;
            }
        }

        return maxSoFar;
    }
}
