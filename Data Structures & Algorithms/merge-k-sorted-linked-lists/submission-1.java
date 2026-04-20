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
        ListNode merged = new ListNode();
        ListNode head = merged;

        Queue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(node -> node.val));

        for (ListNode node : lists) {
            if (node != null) {
                queue.offer(node);
            }
        }

        while (!queue.isEmpty()) {
            ListNode lowestValNode = queue.poll();

            merged.next = new ListNode(lowestValNode.val);
            merged = merged.next;

            if (lowestValNode.next != null) {
                queue.offer(lowestValNode.next);
            }
        }

        return head.next;
    }
}
