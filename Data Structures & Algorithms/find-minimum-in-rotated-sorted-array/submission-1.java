class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int lowest = Integer.MAX_VALUE;

        while (l <= r) {
            int mid = (l + r) / 2;
            lowest = Math.min(lowest, nums[mid]);
            if (nums[l] > nums[r]) {
                l = l + 1;
            } else {
                r = r - 1;
            }
        }

        return lowest;
    }
}
