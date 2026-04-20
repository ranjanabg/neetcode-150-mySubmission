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
    public ListNode reverseList(ListNode head) {
        List<Integer> value = new ArrayList<>();
        ListNode curr = head;

        while (curr != null) {
            value.add(0, curr.val);
            curr = curr.next;
        }

        int i = 0;
        curr = head;
        while (curr != null) {
            curr.val = value.get(i);
            i++;
            curr = curr.next;
        }

        return head;
    }
}
