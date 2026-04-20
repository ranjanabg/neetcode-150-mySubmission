class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean[] added = new boolean[nums.length];
        List<List<Integer>> result = new ArrayList<>();

        backtrack(nums, added, new ArrayList<>(), result);

        return result;
    }

    private void backtrack (int[] nums, boolean[] added, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
        }

        for (int i = 0; i < nums.length; i++) {
            if(!added[i]) {
                current.add(nums[i]);
                added[i] = true;
                backtrack(nums, added, current, result);
                current.remove(current.size() - 1);
                added[i] = false;
            }
        }
    }
}
