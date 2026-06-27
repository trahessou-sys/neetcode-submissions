class Solution {

    public boolean trouver(char[][] board,int i,int j, String word, int compteur, int[][] vus){
        
        if(compteur>=word.length()){
            return true;
        }
        if(!(board[i][j]==word.charAt(compteur))){
            return false;
        }else{
            if(compteur + 1 >= word.length()) return true;
            vus[i][j]=1;
            boolean enhaut= (i>0 && vus[i-1][j]!=1)? trouver(board,i-1,j,word,compteur+1,vus) : false;
            boolean enbas= (i<board.length-1 && vus[i+1][j]!=1)? trouver(board,i+1,j,word,compteur+1,vus) : false;
            boolean agauche=(j>0 && vus[i][j-1]!=1)? trouver(board,i,j-1,word,compteur+1,vus) : false;
            boolean adroite=(j<board[0].length-1 && vus[i][j+1]!=1)? trouver(board,i,j+1,word,compteur+1,vus): false;
            vus[i][j]=0;
            return enhaut || enbas || agauche || adroite;
        }
    }




    public boolean exist(char[][] board, String word) {

        if(board.length==1 && board[0].length==1 && word.length()==1){
            return board[0][0]==word.charAt(0);
        }
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(trouver(board,i,j,word,0,new int[board.length][board[0].length])){
                    return true;
                }
            }
        }
        return false;

    }
}
