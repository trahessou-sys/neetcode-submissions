class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> temp=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            if(temp.size()<k){
                temp.add(nums[i]);
            }else if(nums[i]>temp.peek()){
                temp.poll();
                temp.add(nums[i]);
            }
        }
        return temp.poll();
    }
}
