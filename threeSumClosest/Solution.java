package threeSumClosest;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int Sum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];

                if (total == target) {
                    return target;
                }
                if (Math.abs(target - total) < Math.abs(target - Sum)) {
                    Sum = total;
                }
                if (total < target) {
                    j++;
                } else {
                    k--;
                }

            }
        }
        return Sum;
    }
}