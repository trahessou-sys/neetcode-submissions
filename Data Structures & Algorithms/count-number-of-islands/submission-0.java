class Solution {
    public int numIslands(char[][] grid) {
        int[][] vues= new int[grid.length][grid[0].length];
        int n=grid.length;
        int m=grid[0].length;
        int nbr=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(grid[i][j]=='1' && vues[i][j]==0){
                    nbr+=1;
                    trouverile(grid,i,j,vues);
                }
            }
        }
        return nbr;
        
    }

    public void trouverile(char[][] grid,int ligne,int colon, int[][] vue){
        if(grid[ligne][colon]=='1' && vue[ligne][colon]!=1){
            vue[ligne][colon]=1;
            if(ligne>0 && vue[ligne-1][colon]==0){trouverile(grid,ligne-1,colon,vue);}
            if(ligne<grid.length-1 && vue[ligne+1][colon]==0){trouverile(grid,ligne+1,colon,vue);}
            if(colon>0 && vue[ligne][colon-1]==0){trouverile(grid,ligne,colon-1,vue);}
            if(colon<grid[0].length-1 && vue[ligne][colon+1]==0){trouverile(grid,ligne,colon+1,vue);}
        }
    }
}
