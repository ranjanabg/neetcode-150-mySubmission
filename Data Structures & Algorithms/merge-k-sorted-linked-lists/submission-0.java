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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = new ListNode();
        ListNode tracker = result;

        Queue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.val));

        for (ListNode node : lists) {
            if (node != null) {
                pq.offer(node);
            }
        }

        while (!pq.isEmpty()) {
            ListNode lowestValueNode = pq.poll();
            tracker.next = new ListNode(lowestValueNode.val);
            tracker = tracker.next;

            if (lowestValueNode.next != null) {
                pq.offer(lowestValueNode.next);
            }

        }
        return result.next;
    }
}
