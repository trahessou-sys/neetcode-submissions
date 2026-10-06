class Solution {
    public int search(int[] nums, int target) {
        if(target<nums[0] || target>nums[nums.length-1]){return -1;}
        return search(nums,target,0,nums.length);
    }

    int search(int[] nums, int target, int low, int high){
        int mid=(low+high)/2;
        if(nums[mid]==target){return mid;}
        if(high-low==1 && nums[low]!=target){return -1;}
        if(target>nums[mid]){return search(nums,target,mid,high);}
        return search(nums,target,low,mid);
    }
}
