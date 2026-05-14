class Solution:
    def productExceptSelf(self, nums):
        pro=1
        array=[]
        num0=0
        for i in nums:
            if i!=0:
                pro*=i
            else:
                num0+=1
        
        for i in nums:
            if num0>=2:
                array.append(0)
            elif num0==0 :
                array.append(int(pro/i))
            else:
                if i==0: array.append(pro)
                else : array.append(0)

        return array