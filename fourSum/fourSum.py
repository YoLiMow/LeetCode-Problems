from typing import List


class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        nums.sort()
        result = []

        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            for j in range(i + 1, len(nums)):
                if j > i + 1 and nums[j] == nums[j - 1]:
                    continue
                
                k, l= j + 1, len(nums) - 1

                while k < l:
                    Sum = nums[i] + nums[j] + nums[k] + nums[l]
                    if Sum == target:
                        result.append([nums[i], nums[j], nums[k], nums[l]])

                        while k < l and nums[k] == nums[k + 1]:
                            k += 1
                        while k < l and nums[l] == nums[l - 1]:
                            l -= 1
                        
                        k += 1
                        l -= 1
                    elif Sum < target:
                        k += 1
                    else:
                        l -= 1
        
        return result