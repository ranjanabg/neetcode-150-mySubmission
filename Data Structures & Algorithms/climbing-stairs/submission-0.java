class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        int possibleWaysWith1Step = climbStairs(n - 1);
        int possibleWaysWith2Step = climbStairs(n - 2);

        return possibleWaysWith1Step + possibleWaysWith2Step;
    }
}
