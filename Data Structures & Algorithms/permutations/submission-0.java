class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] added = new boolean[nums.length];

        backtrack(result, nums, added, new ArrayList<>());

        return result;
    }

    private void backtrack(List<List<Integer>> result, int[] nums, boolean[] added, List<Integer> perms) {
        if (perms.size() == nums.length) {
            result.add(new ArrayList<>(perms));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if (!added[i]) {
                perms.add(nums[i]);
                added[i] = true;
                backtrack(result, nums, added, perms);
                perms.remove(perms.size() - 1);
                added[i] = false;
            }
        }
    }
}
