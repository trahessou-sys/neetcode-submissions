class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> trouve = new ArrayList<>();
        for(String mot : words){
            if(findword(board,mot)){
                trouve.add(mot);
                System.out.print(mot);
            }
        }
        return trouve;
    }

    public boolean findword(char[][] board, String word){
        int[][] vus = new int[board.length][board[0].length];
        boolean trouve=false;

        for(int i =0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){

                if(board[i][j]==word.charAt(0)){
                    vus[i][j]=1;
                    if(word.length()==1){trouve=true;}
                    else{trouve=findword(board,word,0,i,j,vus);}
                }

                if(trouve){break;}
                else{vus[i][j]=0;}
            }
            if(trouve){break;}
        }
        return trouve;
    }

    public boolean findword(char[][] board, String word, int posi, int ligne, int colon, int[][]vue){
        if(posi==word.length()-1 && board[ligne][colon]==word.charAt(posi)){return true;}
        else if(board[ligne][colon]!=word.charAt(posi)){return false;}
        else{
            vue[ligne][colon]=1;
            if(ligne>0 && vue[ligne-1][colon]==0 && findword(board,word,posi+1,ligne-1,colon,vue)) return true;
            if(ligne<board.length-1 && vue[ligne+1][colon]==0 && findword(board,word,posi+1,ligne+1,colon,vue)) return true;
            if(colon>0 && vue[ligne][colon-1]==0 && findword(board,word,posi+1,ligne,colon-1,vue)) return true;
            if(colon<board[0].length-1 && vue[ligne][colon+1]==0 && findword(board,word,posi+1,ligne,colon+1,vue)) return true;
            return false;
        }
    }

    
}
