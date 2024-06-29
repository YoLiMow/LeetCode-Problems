from typing import List

class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()
        sum = nums[0] + nums[1] + nums[2]

        for i in range(len(nums) - 2):
            j, k = i + 1, len(nums) - 1

            while j < k:
                total = nums[i] + nums[j] + nums[k]

                if total == target:
                    return target
                
                if abs(target - total) < abs(target - sum):
                    sum = total
                
                if total < target:
                    j += 1
                else:
                    k -= 1
        return sum