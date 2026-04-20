class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int longestConsecutiveSequence = 1;
        int length = 1;

        if (nums.length == 0) {
            return 0;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            //System.out.println(nums[i]);
            if (nums[i] + 1 == nums[i + 1]) {
                length++;
                longestConsecutiveSequence = Math.max(longestConsecutiveSequence, length);
            } else if (nums[i] == nums[i + 1]) {
                continue;
            } else {
                length = 1;
            } 
        }

        return longestConsecutiveSequence;
    }
}
