class Solution {
    public int[] topKFrequent(int[] nums, int p) {
        Set<Integer> ordre = new HashSet<>();
        HashMap<Integer,Integer> occu = new HashMap<>();
        for(int i : nums){
            if(!occu.containsKey(i)){
                occu.put(i,1);
            }else{
                occu.put(i,occu.get(i)+1);
            }
            ordre.add(i);
        }
        int[] voir = new int[ordre.size()];
        int i=0;
        for(int x : ordre){
            voir[i++]=x;
        }

        for(int j=1;j<voir.length;j++){
            int x =voir[j];
            int k=j;
            while(k>0 && occu.get(voir[k-1])<occu.get(x)){
                voir[k]=voir[k-1];
                k--;
            }
            voir[k]=x;
        }

        int[] retour = new int[p];
        for(int l=0;l<p;l++){
            retour[l]=voir[l];
        }
        return retour;
    }

}
