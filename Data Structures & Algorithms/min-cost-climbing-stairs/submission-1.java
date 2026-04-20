class Solution {
    
    Map<Integer, Integer> minCostCache = new HashMap<>();

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

        if (minCostCache.containsKey(startIndex)) {
            return minCostCache.get(startIndex);
        }
        int oneJumpCost = minCostClimbingStairs(startIndex + 1, cost);
        int twoJumpCost = minCostClimbingStairs(startIndex + 2, cost);

        minCostCache.put(startIndex, cost[startIndex] + Math.min(oneJumpCost, twoJumpCost));
        return minCostCache.get(startIndex);
    }
}
