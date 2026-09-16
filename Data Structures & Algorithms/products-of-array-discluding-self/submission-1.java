class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zero =-1;
        int product=1;
        int[] products= new int[nums.length];

        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                product*=nums[i];
            }else{
                if(zero==-1){
                    zero=i;
                }else{
                    return products;
                }
            }
        }

        if(zero!=-1){
            products[zero]=product;
        }else{
            for(int i=0;i<nums.length;i++){
                products[i]=product/nums[i];
            }
        }
        return products;
    }
}  
