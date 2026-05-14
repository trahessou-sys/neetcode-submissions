class Solution:
    def findMin(self, nums):
        if len(nums)==1:
            return nums[0]
        if nums[-1]<nums[0]:
            i=len(nums)-1
            while i>=0 and nums[i]>nums[i-1]:
                i-=1
            return nums[i]
        else:
            i=0
            while i<len(nums) and nums[i]<nums[i+1]:
                i+=1
                if i==len(nums)-1:
                    return nums[0]
            return nums[i]
        