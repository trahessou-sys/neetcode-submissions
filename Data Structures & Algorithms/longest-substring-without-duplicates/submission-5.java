class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){return 0;}
        Set<Character> verif = new HashSet<>();
        int deb=0;
        int max=1;
        for(int i=0;i<s.length();i++){
            if(!verif.contains(s.charAt(i))){
                verif.add(s.charAt(i));
                max=Math.max(max,verif.size());
            }else{
                while(deb<s.length() && s.charAt(deb)!=s.charAt(i)){
                    verif.remove(s.charAt(deb));
                    deb++;
                }
                if(deb<s.length()){
                    deb++;
                }
            }
        }
        return max;
    }
}
