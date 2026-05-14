class Solution:
    def longestConsecutive(self, nums):
        liste=[]
        vu=[]
        indx_max=0
        for i in range(len(nums)):
            
                liste.append([nums[i]])

                while liste[-1][-1]+1 in nums:
                    liste[-1].append(liste[-1][-1]+1)
                if len(liste[-1])>indx_max:
                    indx_max=len(liste[-1])
        print(liste)
        return indx_max
            

        