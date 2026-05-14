class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum2=0;

        for(int i=0;i<n;i++){
            sum2=sum2+nums[i];
        }

        return (n+1)*(n)/2 -sum2;
    }
}
