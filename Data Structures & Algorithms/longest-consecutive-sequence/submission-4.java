class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> valeurs=new HashSet<>();
        for(int i : nums){
            valeurs.add(i);
        }
        int max=0;
        for(int i : valeurs){
            if(!valeurs.contains(i-1)){
                int k=1;
                while(valeurs.contains(i+k)){
                    k++;
                }
                if(k>max){max=k;}
            }
        }
        return max;
    }
}
