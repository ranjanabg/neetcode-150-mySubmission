class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        output[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            output[i] = output[i - 1] * nums[i - 1]; 
        }

        int temp = 1;
        for (int i = output.length - 1; i >= 0; i--) {
            output[i] *= temp;
            temp *= nums[i];
        }
        return output;
    }
}  
