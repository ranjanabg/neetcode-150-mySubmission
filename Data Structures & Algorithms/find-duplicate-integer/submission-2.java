class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = slow + 1;

        while (true) {
            if (nums[slow] == nums[fast]) {
                break;
            }

            if (fast < nums.length - 1) {
                fast++;
                continue;
            }
            
            if (slow < nums.length - 1) {
                slow++;
                fast = slow + 1;
            }
        }

        return nums[slow];
    }
}
