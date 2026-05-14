class Solution:
    def topKFrequent(self, nums, k):
        dico={}
        resul=[]
        vu=[]
        for i in range(len(nums)):
            if nums[i] not in vu:
                vu.append(nums[i])
                dico[nums[i]]=1
                for j in range(len(nums)):
                    if nums[i]==nums[j] and i<j:
                        dico[nums[i]]+=1

                if len(resul)<k :
                    resul.append(nums[i])

                else :
                    indx=0
                    for l in range(len(resul)):
                        if dico[resul[l]]<dico[resul[indx]]:
                            indx=l
                    if dico[nums[i]]>dico[resul[indx]]:
                        resul.remove(resul[indx])
                        resul.append(nums[i])
       
        return resul
        
        