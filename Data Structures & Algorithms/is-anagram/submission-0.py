class Solution:
    def isAnagram(self, s,t):
        gh=sorted(list(s))
        gj=sorted(list(t))
        if gh==gj: return True
        return False
        