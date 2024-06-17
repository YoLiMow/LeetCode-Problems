package reverseInteger;

public class Solution {
    public int reverse(int x) {
        int INT_MAX = Integer.MAX_VALUE; // 2^31 - 1
        int INT_MIN = Integer.MIN_VALUE; // -2^31
        
        long y = 0; // Use long to handle overflow during calculation
        
        while (x != 0) {
            int lastDigit = x % 10;
            y = y * 10 + lastDigit;
            x = x / 10;
        }
        
        // Check for overflow
        if (y > INT_MAX || y < INT_MIN) {
            return 0;
        }
        
        return (int) y;
    }
}