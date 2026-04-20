class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int left = 0;
        int right = 1;

        while (right < prices.length) {
            if (prices[right] > prices[left]) {
                profit = Math.max(profit, prices[right] - prices[left]);
                right++;
            } else {
                left = right;
                right++;
            }
        }

        return profit;
    }
}
