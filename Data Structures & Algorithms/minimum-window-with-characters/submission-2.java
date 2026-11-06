class Solution {
    public String minWindow(String s, String t) {
        
        int m=s.length();
        int n=t.length();
        if(m<n){return "";}
        int i=0;
        int j=0;

        int st=-1;
        int ed=-1;

        int[] occu=new int[52];
        int[] occu2=new int[52];

        for(int k=0;k<n;k++){
            occu[index(t.charAt(k))]++;
        }

        while(j<m){
            occu2[index(s.charAt(j))]++;
            while(!valid(occu,occu2) && j<m-1){
                j++;
                occu2[index(s.charAt(j))]++;
            }
            
            while(valid(occu,occu2) && i<=j){
                occu2[index(s.charAt(i))]--;
                i++;
            }

            if(i>0){
                occu2[index(s.charAt(i-1))]++;
                if(valid(occu,occu2)&& (st==-1 ||ed-st>j-(i-1)+1)){
                    st=i-1;
                    ed=j+1;
                }
                occu2[index(s.charAt(i-1))]--;
            }
            j++;
            
        }
        return (st==-1)? "" : s.substring(st,ed);
    }

    private boolean valid(int[] o, int[] t){
        for(int i=0;i<52;i++){
            if(o[i]>t[i]){
                return false;
            }
        }
        return true;
    }

    private int index(char c){
        if(c >= 'a' && c <= 'z'){
            return c - 'a';          
        }
        return c - 'A' + 26;         
    }
}
