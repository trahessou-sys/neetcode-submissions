class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int c =numbers[i]+numbers[j];
        while(i<j){
            if(c==target){return new int[]{i+1,j+1};}
            else if(c>target){
                j--;
            }else{
                i++;
            }
            c=numbers[i]+numbers[j];
        }
        return new int[2];
    }
}
