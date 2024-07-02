from typing import Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        pre_head = ListNode(0, head)
        curr, prev = head, pre_head

        for i in range(n):
            curr = curr.next

        while curr:
            curr = curr.next
            prev = prev.next

        prev.next = prev.next.next

        return pre_head.next 