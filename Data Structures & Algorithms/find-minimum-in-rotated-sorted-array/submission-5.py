class Solution(object):
    def findMin(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if(len(nums)==1):
            return nums[0]

        low=0
        high=len(nums)
        
        while(low<high):
            mid=(low+high)//2
            if(mid==0):
                return nums[0]
            
            if(nums[mid]>nums[len(nums)-1]):
                low=mid+1
            elif(nums[mid-1]>nums[len(nums)-1]):
                return nums[mid]
            else:
                high=mid
            
        return nums[low]
            