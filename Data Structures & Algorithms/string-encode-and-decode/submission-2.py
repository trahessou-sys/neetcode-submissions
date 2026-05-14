class Solution:

    def encode(self, strs):
        mot=""
        for j in  strs:
            mot+=j+"§"
        return mot

    def decode(self, s):
        liste=[]
        look=[-1]
        for i in range(len(s)):
            if s[i]=="§":
                look.append(i)

        for j in range(len(look)):
            
            if j<len(look)-1:
                liste.append(s[look[j]+1:look[j+1]])
        return liste
