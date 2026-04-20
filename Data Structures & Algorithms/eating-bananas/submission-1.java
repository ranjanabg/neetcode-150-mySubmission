class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = Arrays.stream(piles).max().getAsInt();
        int result = max;

        while (min <= max) {
            int totalTime = 0;
            int k = (min + max) / 2;

            for (int pile : piles) {
                totalTime += Math.ceil((double)pile / k);
            }

            if (totalTime <= h) {
                result = k;
                max = k - 1;
            } else {
                min = k + 1;
            }
        }

        return result;
    }
}
