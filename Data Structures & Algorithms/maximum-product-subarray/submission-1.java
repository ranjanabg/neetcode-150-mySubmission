class Solution {
    public int maxProduct(int[] nums) {
        int currMax = nums[0];
        int currMin = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num < 0) {
                int tmp = currMax;
                currMax = currMin;
                currMin = tmp;
            }

            currMax = Math.max((num * currMax), num);
            currMin = Math.min((num * currMin), num);

            result = Math.max(result, currMax);
        }

        return result;
    }
}
