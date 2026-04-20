class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> merged = new ArrayList<>();

        merged.add(newInterval);

        for (int[] interval : intervals) {
            merged.add(interval);
        }

        return this.mergeIntervals(merged.toArray(new int[merged.size()][]));
    }

    public int[][] mergeIntervals (int[][] intervals) {
        List<int[]> merged = new ArrayList<>();
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int[] prevInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] currInterval = intervals[i];

            if (prevInterval[1] >= currInterval[0]) {
                prevInterval[1] = Math.max(prevInterval[1], currInterval[1]);
            } else {
                merged.add(prevInterval);
                prevInterval = currInterval;
            }
        }
        merged.add(prevInterval);

        return merged.toArray(new int[merged.size()][]);
    }
}
