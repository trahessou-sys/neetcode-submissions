class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return search(matrix,target,0,matrix.length-1);
    }

    boolean search(int[][] matrix, int target, int low, int high){
        if(low>high){return false;}
        int mid = low+(high-low)/2;
        int[] ligne = matrix[mid];
        if(ligne[0]>target){
            return search(matrix,target,low,mid-1);        
        }
        if(ligne[ligne.length-1]<target){
            return search(matrix,target,mid+1,high);       
        }
        return search(ligne,target,0,ligne.length-1);      
    }

    boolean search(int[] ligne, int target, int low, int high){
        if(low>high){return false;}
        int mid = low+(high-low)/2;
        if(ligne[mid]==target){return true;}
        if(ligne[mid]<target){
            return search(ligne,target,mid+1,high);
        }
        return search(ligne,target,low,mid-1);
    }
}
