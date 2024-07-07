package swapPairs;

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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode cur = head;
        while (cur != null) {
            int temp = cur.val;
            if (cur.next != null){
                cur.val = cur.next.val;
                cur.next.val = temp;
                cur = cur.next;
            }
            cur = cur.next;
        }
        return head;
    }
}