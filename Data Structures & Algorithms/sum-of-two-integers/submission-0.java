class Solution {
    public int getSum(int a, int b) {
        int res = 0;
        int carry = 0;
        for (int i = 0; i < 32; i++) {
            int bita = (a >> i) & 1;
            int bitb = (b >> i) & 1;
            
            int sum = bita ^ bitb ^ carry;      
            carry = (bita & bitb) | (carry & (bita ^ bitb)); 
            
            res |= (sum << i);  
        }
        return res;
    }
}
