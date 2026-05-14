class Solution:
    def isValid(self, s):
        b=len(s)
        for i in range(b):
            c=False

            if s[i] in ['(','[','{']:
                for j in range(i+1,len(s)):
                    if s[i]=='(':
                        mp=j-i+1
                        if s[j]==')' and mp%2==0:
                            c=True
                            break
                    elif s[i]=='[':
                        mp=j-i+1
                        if s[j]==']' and mp%2==0:
                            c=True
                            break
                    elif s[i]=='{':
                        mp=j-i+1
                        if s[j]=='}' and mp%2==0:
                            c=True
                            break
            
            
            elif s[i] in [')',']','}']:
                for j in range(i-1,-1,-1):
                    if s[i]==')':
                        mp=i-j+1
                        if s[j]=='(' and mp%2==0:
                            c=True
                            break
                    elif s[i]==']':
                        mp=i-j+1
                        if s[j]=='[' and mp%2==0:
                            c=True
                            break
                    elif s[i]=='}':
                        mp=i-j+1
                        if s[j]=='{' and mp%2==0:
                            c=True
                            break

            
            
            
            if c==False:
                return False
        return True


        