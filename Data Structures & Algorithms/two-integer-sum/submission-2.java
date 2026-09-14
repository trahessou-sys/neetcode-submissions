class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] retour=new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int difference=target-nums[i];
            if(map.containsKey(difference)){
                retour[0]=map.get(difference);
                retour[1]=i;
                return retour;
            }else{
                map.put(nums[i],i);
            }
        }
        return retour;
    }
}
