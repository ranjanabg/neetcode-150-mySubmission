class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = sumOfSquares(n);

        while (slow != fast) {
            fast = sumOfSquares(fast);
            fast = sumOfSquares(fast);
            slow = sumOfSquares(slow);
        }

        return fast == 1;
    }


    private int sumOfSquares(int n) {
        int output = 0;

        while ( n > 0) {
            int num = n % 10;
            output += num * num;
            n = n / 10;
        }

        return output;
    }
}
