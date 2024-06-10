package AddTwoNumbers;

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode changes = result;
        int carryon = 0;

        while(l1 != null || l2 != null || carryon != 0) {
            if (l1 != null) {
                carryon = carryon + l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carryon = carryon + l2.val;
                l2 = l2.next;
            }       
            changes.next = new ListNode(carryon % 10);
            carryon = carryon / 10;
            changes = changes.next;
        }
        return result.next;
    }
}
