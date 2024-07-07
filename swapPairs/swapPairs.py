from typing import Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return head

        cur = head
        while cur:
            temp = cur.val
            if cur.next:
                cur.val = cur.next.val
                cur.next.val = temp
                cur = cur.next

            cur = cur.next
        
        return head