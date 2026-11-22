class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> retour = new ArrayList<>();
        List<Integer> actu = new ArrayList<>();
        for(int i=0;i<nums.length;i++){actu.add(-1);}
        Set<Integer> calls=new HashSet<>();
        fill(nums,actu,retour,calls,0);
        return retour;
    }

    private void fill(int[] nums, List<Integer> a, List<List<Integer>> r, Set<Integer> c, int idx){
        if(idx==nums.length){r.add(new ArrayList<>(a));}
        for(int i=0;i<nums.length;i++){
           if(!c.contains(i)){
             a.set(idx,nums[i]);
             c.add(i);
             fill(nums,a,r,c,idx+1);
             c.remove(i);
           }
        }

    }
}
