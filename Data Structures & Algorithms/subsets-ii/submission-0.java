class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(nums);

        backtrack (nums, 0, current, result);

        return result;
    }

    private void backtrack (int[] nums, int i, List<Integer> current, List<List<Integer>> result) {
        
        result.add(new ArrayList<>(current));
         
        for (int index = i; index < nums.length; index++) {
            if (index > i && nums[index] == nums[index - 1]) {
                continue;
            }

            current.add(nums[index]);
            backtrack(nums, index + 1, current, result);
            current.remove(current.size() - 1);
        }
        
    }
}
