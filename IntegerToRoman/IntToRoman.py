class Solution:
    def intToRoman(self, num: int) -> str:
        Roman = ''
        storeInt = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
        storeRoman = ["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]
        
        for i in range(len(storeInt)):
            while num >= storeInt[i]:
                Roman += storeRoman[i]
                num -= storeInt[i]

        return Roman