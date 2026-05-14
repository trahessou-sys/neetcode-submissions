def areAnagrams(mot1,mot2):
        gh=sorted(list(mot1))
        gj=sorted(list(mot2))
        if gh==gj: return True
        return False

class Solution:
    


    def groupAnagrams(self, strs):
        resul=[]
        vu=[]
        for i in range(len(strs)):
            same=[strs[i]]
            for j in range(len(strs)):
                if areAnagrams(strs[i],strs[j]) and i!=j:
                    same.append(strs[j])
                    vu.append(j)
            if i in vu : 
                pass
            else:
                resul.append(same)
                print(resul)
                vu.append(i)
        return resul
                
            

        