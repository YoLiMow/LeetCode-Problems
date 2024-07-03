class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        mapping = {')': '(', '}': '{', ']': '['}

        for char in s:
            if char in mapping:
                if len(stack) != 0:
                    e = stack.pop()
                else:
                    return False
                if mapping[char] != e:
                    return False
            else:
                stack.append(char)

        return not stack