class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currLength = 1;
                while (set.contains(num + 1)) {
                    currLength++;
                    num++;
                }

                maxLength = Math.max(maxLength, currLength);
            }


        }

        return maxLength;
    }
}
