class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        int[] prevInterval = intervals[0];
        int toRemove = 0;

        for (int i = 1; i < intervals.length; i++) {
            int[] currInterval = intervals[i];

            if (prevInterval[1] > currInterval[0]) {
                toRemove++;
                prevInterval[1] = Math.min(prevInterval[1], currInterval[1]);
                continue;

            }
            
            prevInterval = currInterval;
        }

        return toRemove;
    }
}
