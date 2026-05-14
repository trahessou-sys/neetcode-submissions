class Solution:
    def isPalindrome(self, d):
        s=d.lower()
        mot=""
        mot2=""
        for i in range(len(s)):
            if ord("A")<=ord(s[i])<=ord("Z") or ord('a')<=ord(s[i])<=ord('z') or ord('0')<=ord(s[i])<=ord('9'):
                mot=mot+s[i]
                mot2=s[i]+mot2
        return mot==mot2
        