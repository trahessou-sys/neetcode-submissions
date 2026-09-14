class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] retour=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    retour[0]=i;
                    retour[1]=j;
                    return retour;
                }
            }
        }
        return retour;
    }
}
