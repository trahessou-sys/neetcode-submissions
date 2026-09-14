class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> retour = new ArrayList<>();
        List<int[]> occu= new ArrayList<>();
        Set<Integer> vus = new HashSet<>();

        for(String s : strs){
            int[] oc = new int[26];
            for(int i=0;i<s.length();i++){
                oc[s.charAt(i)-'a']+=1;
            }
            occu.add(oc);
        }

        for(int i=0;i<strs.length;i++){
            if(!vus.contains(i)){
                List<String> actu = new ArrayList<>();
                actu.add(strs[i]);
                for(int j=i+1;j<strs.length;j++){
                    if(!vus.contains(j)){
                        boolean ak=true;
                        for(int k=0;k<26;k++){
                            if(occu.get(i)[k]!=occu.get(j)[k]){
                                ak=false;
                                break;
                            }
                        }
                        if(ak){
                            actu.add(strs[j]);
                            vus.add(j);
                        }
                    }
                }
                vus.add(i);
                retour.add(actu);
            }
        }
        return retour;
        

        
    }
}
