package divideTwoIntegers;

public class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        int sign = (dividend > 0) == (divisor > 0) ? 1 : -1;

        long x = Math.abs((long) dividend);
        long y = Math.abs((long) divisor);

        int result = 0;

        // while (x >= y) {
        //     long temp = y, multiple = 1;
        //     while (x >= (temp * 2)) {
        //         temp *= 2;
        //         multiple *= 2; 
        //     }
        //     x -= temp;
        //     result += multiple;
            
        // }
        while (x >= y) {
            long temp = y, multiple = 1;
            while (x >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1; 
            }
            x -= temp;
            result += multiple;
            
        }
        return sign * result;
    }
}