class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> r = new ArrayList<>();
        List<Integer> actu =new LinkedList<>();
        r.add(new ArrayList<>(actu));
        fill(nums,actu,r,-1);
        return r;
    }

    private void fill(int[] nums, List<Integer> a,List<List<Integer>> r, int idx){
        if(idx>=nums.length){return;}
        for(int i=idx+1;i<nums.length;i++){
            a.add(nums[i]);
            r.add(new ArrayList<>(a));
            fill(nums,a,r,i);
            a.removeLast();
        }
    }
}
