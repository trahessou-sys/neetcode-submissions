class Solution {
    public boolean isPalindrome(String s) {
     int i=0;
        int j=s.length()-1;
        while(i<=j){
            while(i<s.length() &&!valid(s.charAt(i))){
                i++;
            }
            while(0<=j && !valid(s.charAt(j))){
                j--;
            }
            if(i<s.length() && j>=0 && Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean valid(char c){
        if('a'<=c && c<='z'){return true;}
        if('A'<=c && c<='Z'){return true;}
        if('0'<=c && c<='9'){return true;}
        return false;
    }
}
