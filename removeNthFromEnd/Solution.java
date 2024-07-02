package removeNthFromEnd;

/**
 * Definition for singly-linked list. 
*/
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre_head = new ListNode(0, head);

        ListNode curr = head;
        ListNode prev = pre_head;

        for (int i = 0; i < n; i++) {
            curr = curr.next;
        }

        while (curr != null) {
            curr = curr.next;
            prev = prev.next;
        }

        prev.next = prev.next.next;

        return pre_head.next;
    }
}