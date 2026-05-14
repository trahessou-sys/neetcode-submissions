class Solution:
    def search(self, nums, target):
        if not target in nums:
            return -1
        else:
            for i in range(len(nums)):
                if nums[i]==target:
                    return i
            
        