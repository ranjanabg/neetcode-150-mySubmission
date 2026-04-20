class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int maxWater = Integer.MIN_VALUE;

        while (i < j) {
            int water = (Math.min(heights[i],heights[j])) * (j - i);
            maxWater = Math.max(water, maxWater);

            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxWater;
    }
}
