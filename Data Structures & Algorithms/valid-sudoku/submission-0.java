class Solution {
    public boolean isValidSudoku(char[][] g) {
        for(int p=0;p<9;p++){ 
            Set<Character> verif_c =new HashSet<>();
            Set<Character> verif_l =new HashSet<>();
            for(int k=0;k<9;k++){
                if(g[p][k]!='.' && !verif_l.add(g[p][k]) ){
                    return false;
                }
                if(g[k][p]!='.' && !verif_c.add(g[k][p]) ){
                    return false;
                }
            }
        }

        for (int b = 0; b < 9; b++) {
            Set<Character> verif=new HashSet<>();
            for (int i = 0; i < 9; i++) {
                int r = 3 * (b / 3) + i / 3;
                int c = 3 * (b % 3) + i % 3;
                if(g[r][c]!='.' && !verif.add(g[r][c]) ){
                    return false;
                }
        
            }
        }
        return true;
    }
}
