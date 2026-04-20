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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode();
        ListNode head = merged;

        while (list1 != null || list2 != null) {
            int list1Val = list1 == null ? Integer.MAX_VALUE : list1.val;
            int list2Val = list2 == null ? Integer.MAX_VALUE : list2.val;

            if (list1Val <= list2Val) {
                merged.next = list1;
                list1 = list1.next;
            } else {
                merged.next = list2;
                list2 = list2.next;
            }

            merged = merged.next;
        }

        return head.next;
    }
}