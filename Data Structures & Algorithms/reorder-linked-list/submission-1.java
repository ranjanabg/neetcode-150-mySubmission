/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();

        ListNode tracker = head;
        while (tracker != null) {
            stack.push(tracker);
            tracker = tracker.next;
        }

        int linkedListLength = stack.size();
        tracker = head;
        ListNode leadingTracker = tracker == null ? null : tracker.next;
        for (int i = 0; i < (linkedListLength - 1)/2; i++) {
            tracker.next = stack.pop();
            stack.peek().next = null;
            
            tracker = tracker.next;
            tracker.next = leadingTracker;

            tracker = tracker.next;
            leadingTracker = leadingTracker.next;
        }
    }
}
