from typing import List


class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height) - 1
        Max = 0

        while left < right:
            cur = min(height[left], height[right]) * (right - left)
            Max = max(Max, cur)

            if height[left] < height[right]:
                left += 1
            else:
                right -= 1

        return Max