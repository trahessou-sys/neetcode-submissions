class Solution:
    def characterReplacement(self, s, k):
        maxChar=0
        b=len(s)

        for i in range(b):
            print("on est sur "+str(i)+" position")
            ko=k
            char=1

            
            for j in range(i+1,b):
                if s[j]==s[i]:
                    char+=1
                elif ko==0:
                    break
                else:
                    ko-=1
                    char+=1
                

                
                
          
            if ko>0:
                j=i-1
                while j>=0 :
                    if s[j]==s[i]:
                        char+=1
                    elif ko==0: 
                        break

                    else:
                        ko-=1
                        char+=1
                    j-=1
                    
                    
            
            if char>maxChar : maxChar=char
        return maxChar

        