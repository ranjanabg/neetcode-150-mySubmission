class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(target - nums[i])) {
                //return new int[numsMap.get(target - nums[i], i)];
                result[0] = numsMap.get(target - nums[i]);
                result[1] = i;
            }
            numsMap.put(nums[i], i);
        }

        return result;
    }
}
