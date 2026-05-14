def verif(lm,pm):
    l=sorted(lm)
    m=sorted(pm)
    if l==m:
        return True
    return False



class Solution:
    def threeSum(self, nums):
        liste=[]
        vu=[]
        for i in range(len(nums)):
            if not i in vu:
                vu.append(i)

                for j in range(len(nums)):
                    a=-(nums[i]+nums[j])
                    if j!=i and a in nums :

                        for k in range(len(nums)):
                            if nums[k]==a and i!=k and j!=k:
                                cop=True
                                lmk=[nums[i],nums[j],nums[k]]
                                for g in liste:
                                    if verif(g,lmk): cop=False
                                
                                if cop :
                                    liste.append(lmk)
        return liste

                            

        