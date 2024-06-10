from typing import Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        result = ListNode(0)
        changes = result
        carryon = 0
        while l1 != None or l2 != None or carryon != 0:
            if l1 != None:
                carryon += l1.val
                l1 = l1.next
            if l2 != None:
                carryon += l2.val
                l2 = l2.next
            newNode = ListNode(carryon % 10)
            changes.next = newNode
            carryon = carryon // 10
            changes = changes.next
        return result.next