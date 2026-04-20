class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int num = 0;
        int range = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }


        return range;
    }
}
