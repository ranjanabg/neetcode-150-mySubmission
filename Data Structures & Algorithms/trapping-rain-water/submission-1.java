class Solution {
    public int trap(int[] height) {
        int res = 0;
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        // store prefixMax
        int maxPrefix = 0;
        for (int i = 0; i < height.length; i++) {
            maxPrefix = Math.max(height[i], maxPrefix);
            leftMax[i] = maxPrefix;
        }

        // store suffix
        int maxSuffix = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            maxSuffix = Math.max(height[i], maxSuffix);
            rightMax[i] = maxSuffix;
        }
        int i = 0;
        while (i < height.length) {
            res += Math.min(leftMax[i], rightMax[i]) - height[i];
            i++;
        }

        return res;
    }
}
