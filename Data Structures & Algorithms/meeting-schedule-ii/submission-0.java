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
        int daysRequired = 0;

        intervals.sort(Comparator.comparingInt(interval -> interval.start));

        Queue<Interval> pq = new PriorityQueue<>(Comparator.comparingInt(interval -> interval.end));

        for (Interval meeting : intervals) {
            if (pq.isEmpty()) {
                pq.offer(meeting);
                daysRequired++;
            } else {
                Interval firstCompletedMeeting = pq.peek();
                if (firstCompletedMeeting.end <= meeting.start) {
                    pq.poll();
                    pq.offer(meeting);
                } else {
                    pq.offer(meeting);
                    daysRequired++;
                }
            }
        }
        return daysRequired;
    }
}
