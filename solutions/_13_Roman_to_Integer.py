class Solution:
    def romanToInt(self, s: str) -> int:
        Roman = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }

        if len(s) == 1:
            return Roman[s[len(s)-1]]
        
        res = Roman[s[len(s)-1]]
        check = len(s)-2

        while check >= 0:
            if s[check] == 'I' and (s[check+1] == 'V' or s[check+1] == 'X'):
                res -= 1
            elif s[check] == 'X' and (s[check+1] == 'L' or s[check+1] == 'C'):
                res -= 10
            elif s[check] == 'C' and (s[check+1] == 'D' or s[check+1] == 'M'):
                res -= 100
            else:
                res += Roman[s[check]]
            check -= 1

        return res