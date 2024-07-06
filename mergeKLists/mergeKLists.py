from typing import List, Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def merge(self, left: ListNode, right: ListNode) -> ListNode:
        last = ListNode(-1)
        temp = last
        while left and right:
            if left.val < right.val:
                temp.next = left
                temp = temp.next
                left = left.next
            else:
                temp.next = right
                temp = temp.next
                right = right.next
        while left:
            temp.next = left
            temp = temp.next
            left = left.next
        while right:
            temp.next = right
            temp = temp.next
            right = right.next
        return last.next

    def mergeSort(self, lists: List[ListNode], start: int, end: int) -> ListNode:
        if start == end:
            return lists[start]
        mid = start + (end - start) // 2 # Overflow-Safe Method
        left = self.mergeSort(lists, start, mid)
        right = self.mergeSort(lists, mid + 1, end)
        return self.merge(left, right)

    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        if not lists:
            return None
        return self.mergeSort(lists, 0, len(lists) - 1)