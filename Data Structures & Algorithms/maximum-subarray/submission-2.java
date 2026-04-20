class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int bestStart = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (maxSum < sum) {
                maxSum = sum;
                bestStart = start + 1;
                end = i;
            }

            if ( sum < 0) {
                sum = 0;
                start = i;
            }
        }
        System.out.println(bestStart + " " + end);
        return maxSum;
        
    }
}
