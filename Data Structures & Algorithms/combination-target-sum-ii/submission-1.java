class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> uniqueNumsComb = new ArrayList<>();
        List<Integer> currentComb = new ArrayList<>();
        Arrays.sort(candidates);

        backtrack(candidates, target, 0, currentComb, uniqueNumsComb);

        return uniqueNumsComb;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> currentComb, List<List<Integer>>uniqueNumsComb) {
        if (target == 0 ) {
            uniqueNumsComb.add(new ArrayList<>(currentComb));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            if (candidates[i] > target) {
                break;
            }

            currentComb.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i + 1, currentComb, uniqueNumsComb);
            currentComb.remove(currentComb.size() - 1);
        }


    }
}
