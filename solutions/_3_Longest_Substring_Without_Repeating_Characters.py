class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) == 0:
            return 0
        elif len(s) == 1:
            return 1

        res = 0
        sliding_window = []
        for char in s[::1]:
            if char not in sliding_window:
                sliding_window.append(char)
                if len(sliding_window) > res:
                    res = len(sliding_window)
            else:
                sliding_window[:(sliding_window.index(char)+1)] = []
                sliding_window.append(char)
        return res