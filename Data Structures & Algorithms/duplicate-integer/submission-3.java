class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueElements = new HashSet<>();

        for (int num : nums) {
            if (uniqueElements.contains(num)) {
                return true;
            }

            uniqueElements.add(num);
        }

        return false;
    }
}