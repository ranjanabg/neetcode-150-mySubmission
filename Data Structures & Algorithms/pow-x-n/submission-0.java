class Solution {
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        double initialX = x;
        if (n > 0) {
            for (int i = 0; i < n - 1; i++) {
                x = x * initialX;
            }
        } else {
            for (int i = 0; i < Math.abs(n) + 1; i++) {
                x = x / initialX;
            }
        }
        return x;
    }
}
