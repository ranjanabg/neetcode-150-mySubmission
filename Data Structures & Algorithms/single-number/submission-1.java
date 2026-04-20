class Solution {
    public int singleNumber(int[] nums) {
        int i = 0;
        int j = 1;

        while (i < nums.length - 1 && j < nums.length) {
            if (nums[i] == nums[j]) {
                nums[i] = 0;
                nums[j] = 0;
                i++;
                j = i + 1;
            } else if (i != nums.length - 2 && j == nums.length - 1) {
                i++;
                j = i + 1;
            }  
            j++;

        }

        int single = 0;
        for (int num : nums) {
            if (num != 0) {
                single = num;
            }
        }

        return single;

    }
}
