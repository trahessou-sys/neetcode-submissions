class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> retour = new ArrayList<>();

        int top =0;
        int bottom=matrix.length-1;
        int right=matrix[0].length-1;
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
