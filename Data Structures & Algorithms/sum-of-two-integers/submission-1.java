class Solution {
    public int getSum(int a, int b) {
        int P0 = a ^ b;  // initial propagate (bitwise sum, no carry)
        int P = P0;
        int G = a & b;   // initial generate (where a carry is born)
        
        for (int d = 1; d < 32; d <<= 1) {
            G = G | (P & (G << d));
            P = P & (P << d);
        }
        
        return P0 ^ (G << 1);
    }
}
