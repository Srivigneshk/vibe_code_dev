class Solution:
    def myAtoi(self, s):
        i = 0
        n = len(s)
        while i < n and s[i] == ' ':
            i += 1
        sign = 1
        if i < n and (s[i] == '+' or s[i] == '-'):
            if s[i] == '-':
                sign = -1
            i += 1
        result = 0
        while i < n and s[i].isdigit():
            result = result * 10 + int(s[i])
            if sign * result > 2147483647:
                return 2147483647
            if sign * result < -2147483648:
                return -2147483648
            i += 1
        return sign * result