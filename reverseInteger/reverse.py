class Solution:
    def reverse(self, x: int) -> int:
        if x < 0:
            y = -1 * int(str(-x)[::-1])
        else:
            y = int(str(x)[::-1])  

        if y > 2**31 - 1 or y < -2**31:
            y = 0
        return y