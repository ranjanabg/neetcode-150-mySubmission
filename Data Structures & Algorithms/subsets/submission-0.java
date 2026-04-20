class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        findAllSubsets(nums, 0, result, subset);

        return result;
    }

    private void findAllSubsets(int[] nums, int i, List<List<Integer>> result, List<Integer> subset) {
        if (i >= nums.length) {
            result.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);

        findAllSubsets(nums, i + 1, result, subset);
        subset.remove(subset.size() - 1);
        findAllSubsets(nums, i + 1, result, subset);

    }
}
