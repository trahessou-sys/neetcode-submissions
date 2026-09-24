class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){return 0;}
        int max=1;
        for(int i=0;i<s.length();i++){
            Set<Character> verif = new HashSet<>();
            int j=i+1;
            verif.add(s.charAt(i));
            while(j<s.length() && !verif.contains(s.charAt(j))){
                verif.add(s.charAt(j));
                j++;
            }
            max=Math.max(max,verif.size());
        }
        return max;
    }
}
