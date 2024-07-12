class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        if dividend == -2**31 and divisor == -1:
            return 2**31 -1
        
        sign = 1 if (dividend > 0) == (divisor > 0) else -1

        x, y = abs(dividend), abs(divisor)

        result = 0

        while x >= y:
            temp, multiple = y, 1
            while x >= (temp << 1):
                temp <<= 1
                multiple <<= 1
            x -= temp
            result += multiple
        
        return sign * result
