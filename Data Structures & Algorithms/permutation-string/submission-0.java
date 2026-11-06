class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()){return false;}

        int[] occu = new int[26];
        int[] occu2 = new int[26];
        int k=s1.length();

        for(int i=0;i<k;i++){
            occu[s1.charAt(i)-'a']+=1;
        }
        
        int i=0;
        int j=0;
        while(j<k){
            char temp =s2.charAt(j);
            occu2[temp-'a']++;
            j++;
        }
        j--;
        

        while(j<s2.length()-1){
            if(verif(occu,occu2)){
                return true;
            }

            i++;
            j++;

            occu2[s2.charAt(i-1)-'a']--;
            occu2[s2.charAt(j)-'a']++;
        }
        return verif(occu,occu2);
    }

    private boolean verif(int[] o, int[] t){
        for(int i=0;i<26;i++){
            if(o[i]!=t[i]){return false;}
        }
        return true;
    }
}
