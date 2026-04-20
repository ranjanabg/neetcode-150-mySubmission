class Solution {
    
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(
            minCostClimbingStairs(0, cost), 
            minCostClimbingStairs(1, cost)
        );
    }

    public int minCostClimbingStairs(int startIndex, int[] cost) {
        if (cost.length - startIndex < 1) {
            return 0;
        }

        if (cost.length - startIndex == 1) {
            return cost[startIndex];
        }

        int oneJumpCost = minCostClimbingStairs(startIndex + 1, cost);
        int twoJumpCost = minCostClimbingStairs(startIndex + 2, cost);

        return cost[startIndex] + Math.min(oneJumpCost, twoJumpCost);
    }
}
