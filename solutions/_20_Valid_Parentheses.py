from collections import deque

class Solution:
    def isValid(self, s: str) -> bool:
        if (len(s) % 2 != 0):
            return False
        stack = deque()
        for char in s:
            if char == '{' or char == '(' or char == '[':
                stack.append(char)
            else:
                if not stack:
                    return False
                if (stack[-1] == '(' and char == ')') or (stack[-1] == '[' and char == ']') or (stack[-1] == '{' and char == '}'):
                    stack.pop()
                else:
                    return False
        if (len(stack) != 0):
            return False
        return True