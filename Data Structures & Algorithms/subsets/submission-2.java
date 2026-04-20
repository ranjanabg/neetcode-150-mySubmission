class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentSubset = new ArrayList<>();

        backtrack(nums, 0, currentSubset, result);

        return result;
    }

    private void backtrack (int[] nums, int i, List<Integer> currentSubset, List<List<Integer>> result) {
        if (i >= nums.length) {
            result.add(new ArrayList<>(currentSubset));
            return;
        }

        currentSubset.add(nums[i]);
        backtrack(nums, i + 1, currentSubset, result);

        currentSubset.remove(currentSubset.size() - 1);

        backtrack(nums, i + 1, currentSubset, result);
    }
}
