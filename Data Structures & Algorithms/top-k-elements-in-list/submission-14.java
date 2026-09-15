class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> occu = new HashMap<>();
        for(int i:nums){
            if(occu.containsKey(i)){
                occu.put(i,occu.get(i)+1);
            }else{
                occu.put(i,1);
            }
        }
        List<List<Integer>> ordre = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            ordre.add(new ArrayList<>());
        }
        for(int i : occu.keySet()){
            ordre.get(occu.get(i)-1).add(i);
        }

        int[] retour = new int[k];
        int slider=0;
        int l=nums.length-1;
        while(slider<k){
            for(int i : ordre.get(l)){
                if(slider<k){retour[slider++]=i;}
                else{break;}
            }
            l--;
            if(slider>=k){break;}
        }
        return retour;
    }
}
