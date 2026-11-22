class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> retour = new ArrayList<>();
        List<Integer> temp = new LinkedList<>();
        for(int i=0;i<candidates.length;i++){
            if(i>0 && candidates[i]==candidates[i-1]){continue;}
            f(candidates,target,i,temp, retour);
        }
        return retour;
    }

    private void f(int[] c, int target, int i, List<Integer> temp, List<List<Integer>> r){
        if(i>=c.length){return;}

        if(target-c[i]==0){
            temp.add(c[i]);
            r.add(new ArrayList<>(temp));  
            temp.removeLast();
            return;
        }
        

        if(c[i]>target){return;}

        temp.add(c[i]);
        for(int j=i+1;j<c.length;j++){
            if(j==i+1 || c[j]!=c[j-1]){
                if (c[j] > target - c[i]) break;
                f(c,target-c[i],j,temp,r);
            }
        }
        if(!temp.isEmpty()){temp.removeLast();}
    }
}
