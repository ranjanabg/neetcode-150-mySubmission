class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = nums[i - 1] * prefixSum[i - 1];
        }

        int temp = 1;
        for (int i = prefixSum.length - 1; i >= 0; i--) {
            prefixSum[i] *= temp;
            temp *= nums[i];
        }

        return prefixSum;
    }
}  
