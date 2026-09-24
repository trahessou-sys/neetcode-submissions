class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int[] copie = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            copie[i]=nums[i];
        }

        for(int i=1;i<copie.length;i++){
            int x=copie[i];
            int j=i;
            while(j>0 && copie[j-1]>x){
                copie[j]=copie[j-1];
                j--;
            }
            copie[j]=x;
        }


        List<List<Integer>> retour = new ArrayList<>();

        for(int i=0;i<copie.length-1;i++){
            if (i > 0 && copie[i] == copie[i - 1]) continue;
            int g=i+1;
            int d=copie.length-1;
            while(g<d){
                int s=copie[i]+copie[g]+copie[d];
                if(s>0){d--;}
                else if(s<0){g++;}
                else{
                    List<Integer> ind = new ArrayList<>();
                    ind.add(copie[i]);
                    ind.add(copie[g]);
                    ind.add(copie[d]);
                    retour.add(ind);
                    d--;
                    g++;
                    while (g < d && copie[g] == copie[g - 1]) g++;
                    while (g < d && copie[d] == copie[d + 1]) d--;
                }
            }
        }
        return retour;
    }
}
