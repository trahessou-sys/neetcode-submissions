class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){return false;}
        int[] o1=new int[26];
        int[] o2=new int[26];
        for(int i=0;i<s.length();i++){
            o1[s.charAt(i)-'a']+=1;
            o2[t.charAt(i)-'a']+=1;
        }
        for(int i=0;i<26;i++){
            if(o1[i]!=o2[i]){return false;}
        }
        return true;
    }
}
