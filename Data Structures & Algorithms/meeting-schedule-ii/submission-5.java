/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if (intervals.size() == 0) {
            return 0;
        }
        Collections.sort(intervals, Comparator.comparingInt(m -> m.start));; // sort by start time

        Queue<Integer> minHeap = new PriorityQueue<>(); // sort by endTime;

        minHeap.offer(intervals.get(0).end);

        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start >= minHeap.peek()) {
                minHeap.poll();
            }

            minHeap.offer(intervals.get(i).end);
        }

        return minHeap.size();
    }
}
