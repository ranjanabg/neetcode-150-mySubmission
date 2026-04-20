class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> uniqueCombinations = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();

        backtrack(nums, target, 0, currentCombination, uniqueCombinations);

        return uniqueCombinations;
    }

    private void backtrack (int[] nums, int target, int index, List<Integer> currentCombination, List<List<Integer>> uniqueCombinations) {
        if (target == 0) {
            uniqueCombinations.add(new ArrayList<>(currentCombination));
            return;
        }

        if (target < 0 || index >= nums.length) {
            return;
        }

        currentCombination.add(nums[index]);
        backtrack(nums, target - nums[index], index, currentCombination, uniqueCombinations);
        currentCombination.remove(currentCombination.size() - 1);
        backtrack(nums, target, index + 1, currentCombination, uniqueCombinations);
    }
}
