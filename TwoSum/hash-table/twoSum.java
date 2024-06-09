import java.util.Map;
import java.util.HashMap;

public class twoSum {
    public int[] twosum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int x = target - current;
            if (map.containsKey(x)) {
                return new int[] {
                    map.get(x), i
                };
            }
            map.put(current, i);
        }
        return null;
    }
}