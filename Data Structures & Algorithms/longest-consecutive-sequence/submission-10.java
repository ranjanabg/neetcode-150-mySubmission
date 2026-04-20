class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        if (nums.length == 0) {
            return 0;
        }

        for (int num : nums) {
            set.add(num);
        }

        int longSeqCount = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int length = 1;
                while (set.contains(num + length)) {
                    length++;
                }
                longSeqCount = Math.max(length, longSeqCount);
            }
        }

        return longSeqCount;

    }
}
