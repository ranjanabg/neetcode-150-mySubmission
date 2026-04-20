class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combSet = new ArrayList<>();

        backTrack(nums, target, 0, combSet, result);
        return result;
    }

    private void backTrack(int[] nums, int target, int i, List<Integer> combSet, List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(combSet));
            return;
        }

        if (target < 0 || i >= nums.length) {
            return;
        }

        combSet.add(nums[i]);
        backTrack(nums, target - nums[i], i, combSet, result);
        combSet.remove(combSet.size() - 1);
        backTrack(nums, target, i + 1, combSet, result);
    }
}
