class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (sum(n) != 1) {
            if (set.contains(sum(n))) {
                return false;
                //break;
            }
            set.add(sum(n));
            n = sum(n);
        }

        return true;

    }

    public int sum(int n) {
        int sumOfSquares = 0;
        while (n != 0) {
            int num = n % 10;
            sumOfSquares += num * num;
            n = n / 10;
        }
        return sumOfSquares;
    }
}
