class Solution:
    def twoSum(self, nums, target):
        a=0
        b=1
        while nums[a]+nums[b]!=target:
            b=b+1
            if b>=len(nums):
                a+=1
                b=a+1
        return [a,b]
        