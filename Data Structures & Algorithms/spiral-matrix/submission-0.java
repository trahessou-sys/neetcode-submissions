class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> retour = new ArrayList<>();
        int n=matrix[0].length;
        int m=matrix.length;

        int top =0;
        int bottom=m-1;
        int right=n-1;
        int left=0;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                retour.add(matrix[top][i]);
            }
            top++;

            for (int j = top; j <= bottom; j++) {
                retour.add(matrix[j][right]);
            }
            right--;

            if (top <= bottom) {   
                for (int i = right; i >= left; i--) {
                    retour.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {   
                for (int j = bottom; j >= top; j--) {
                    retour.add(matrix[j][left]);
                }
                left++;
            }
        }

        return retour;

    }
}
