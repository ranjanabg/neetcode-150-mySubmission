class Solution {
    public int rob(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }
        
        int[] maxCost = new int[nums.length];
        maxCost[0] = nums[0];
        maxCost[1] = Math.max(nums[0] , nums[1]);

        for (int i = 2; i < nums.length; i++) {
        // two options: rob this house or rob previous house
        //right behind OR two behind + current house
            maxCost[i] = Math.max(maxCost[i - 2] + nums[i], maxCost[i - 1]);
        }

        return maxCost[maxCost.length - 1];
    }
}
