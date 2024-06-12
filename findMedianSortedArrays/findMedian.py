from typing import List


class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        m, n = len(nums1), len(nums2)
        p1, p2 = 0, 0

        def get_min():
            nonlocal p1, p2 #If you want to modify these variables within a nested function, you need to declare them as nonlocal.
            if p1 < m and p2 < n:
                if nums1[p1] < nums2[p2]:
                    x = nums1[p1]
                    p1 += 1
                else:
                    x = nums2[p2]
                    p2 += 1
            elif p1 < m:
                x = nums1[p1]
                p1 += 1
            elif p2 < n:
                x = nums2[p2]
                p2 += 1
            return x

        if (m + n) % 2 == 0:
            for i in range((m + n) // 2 - 1):
                i = get_min()
            return (get_min() + get_min()) / 2
        else:
            for i in range((m + n) // 2):
                i = get_min()
            return get_min()
