class Solution:
    def myAtoi(self, s: str) -> int:
        s = s.strip()
        if not s:
            return 0

        i, result, sign = 0, 0, 1
        max_int = 2**31 - 1
        min_int = -2**31 

        if s[0] == '+':
            sign = 1
            i += 1
        elif s[0] == '-':
            sign = -1
            i += 1

        while i < len(s):
            if not s[i].isdigit():
                break
            
            # Convert character to integer
            digit = ord(s[i]) - ord('0')
            
            if result > (max_int - digit) // 10:
                if sign == 1:
                    return max_int
                else:
                    return min_int

            result = result * 10 + digit        
            i += 1

        return sign * result