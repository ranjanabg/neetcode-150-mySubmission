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
        intervals.sort(Comparator.comparingInt(interval -> interval.start));
        int minDaysReq = 0;

        Queue<Interval> pq = new PriorityQueue<>(Comparator.comparingInt(interval -> interval.end));

        for (Interval interval : intervals) {
            if (pq.isEmpty()) {
                pq.offer(interval);
                minDaysReq++;
            } else {
                Interval firstCompletedMeeting = pq.peek();
                if (firstCompletedMeeting.end <= interval.start) {
                    pq.poll();
                    pq.offer(interval);
                } else {
                    pq.offer(interval);
                    minDaysReq++;
                }
            }
        }

        return minDaysReq++;


    }
}
