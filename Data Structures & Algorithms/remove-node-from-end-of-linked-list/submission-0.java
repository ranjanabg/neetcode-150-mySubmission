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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int listSize = 0;

        while (curr != null) {
            listSize++;
            curr = curr.next;
        }
        System.out.println(listSize);

        int nodeToRemove = listSize - n;
        System.out.println(nodeToRemove);

        int i = 0;
        curr = head;
        ListNode prev = null;

        while (i != nodeToRemove) {
            prev = curr;
            curr = curr.next;
            i++;
        }

        if (i == 0) {
            return curr.next;
        }

        prev.next = curr.next;
        curr.next = null;

        return head;
    }
}
