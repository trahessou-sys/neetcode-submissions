class Solution {
    public void setZeroes(int[][] matrix) {
        int n =matrix[0].length;
        int m = matrix.length;
        int[] colonnes= new int[n];
        int[] lignes=new int[m];


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    colonnes[j]=1;
                    lignes[i]=1;
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(colonnes[j]==1 || lignes[i]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
