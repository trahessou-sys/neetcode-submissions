class Solution:
    def lengthOfLongestSubstring(self, s):
        b=len(s)
        lengmax=0
        for i in range(b):
            gh=s[i]
            j=i+1
            while j<b and not s[j] in gh :
                gh+=s[j]
                j+=1
                
            
            if len(gh)>lengmax:
                lengmax=len(gh)
        return lengmax
        