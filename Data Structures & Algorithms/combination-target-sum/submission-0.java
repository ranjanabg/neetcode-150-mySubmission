class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        findCombinations(0, nums, target, result, new ArrayList<>());

        return result;
    }

    public void findCombinations(int index, int[] arr, int target, List<List<Integer>> result, List<Integer> subList) {
        if (index == arr.length - 1 && target == 0) {
            result.add(new ArrayList<>(subList));
        }

        if (arr[index] <= target) {
            subList.add(arr[index]);
            findCombinations(index, arr, target - arr[index], result, subList);
            subList.remove(subList.size() - 1);
        }
        
        if (index < arr.length - 1) {
            findCombinations(index + 1, arr, target, result, subList);
        }
    }
}
