class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1 or numRows >= len(s):
            return s

        id, n = 0, 1
        rows = [''] * numRows # List of strings for each row

        for char in s:
            rows[id] += char
            if id == 0:
                n = 1
            elif id == numRows - 1:
                n = -1
            id += n
        return ''.join(rows)