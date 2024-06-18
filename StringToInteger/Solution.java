package StringToInteger;

public class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }

        int i = 0;
        int result = 0;
        int sign = 1;
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        if (s.charAt(i) == '+') {
            sign = 1;
            i++;
        } else if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }

        while (i < s.length()) {
            char c = s.charAt(i);

            if (!Character.isDigit(c)) {
                break;
            }

            int prev = result;
            result = result * 10 + (c - '0');
        
            if (result / 10 != prev) 
            {
                if (sign == -1) {
                    return minInt;
                } else {
                    return maxInt;
                }
            }

            i++;
        }

        return  sign * result;
    }
}