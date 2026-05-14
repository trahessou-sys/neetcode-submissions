class Solution:
    def findMin(self, nums):
        mina=nums[0]
        for i in nums:
            if i<mina: mina=i
        return mina
        