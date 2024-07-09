from typing import List


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        j, n = 1, len(nums)

        for i in range(1, n):
            if nums[i] != nums[i - 1]:
                nums[j] = nums[i]
                j += 1
        
        return j