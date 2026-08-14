class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int ligne=0;ligne<n/2;ligne++){
            tourner(matrix,ligne,n);
        }
    }

    public void tourner(int[][] matrix, int lignetour, int n){
        for(int i=lignetour;i<n-lignetour-1;i++){

            int a1=matrix[lignetour][i];
            int a2=matrix[i][n-lignetour-1];
            int a3=matrix[n-lignetour-1][n-lignetour-1-(i-lignetour)];
            int a4=matrix[n-lignetour-1-(i-lignetour)][lignetour];

            matrix[lignetour][i]=a4;
            matrix[i][n-lignetour-1]=a1;
            matrix[n-lignetour-1][n-lignetour-1-(i-lignetour)]=a2;
            matrix[n-lignetour-1-(i-lignetour)][lignetour]=a3;
        }
    }

    
}
