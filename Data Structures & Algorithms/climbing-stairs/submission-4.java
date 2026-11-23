class Solution {
    List<Integer> liste=new ArrayList<>(Arrays.asList(0,1,2));
    public int climbStairs(int n) {
        if(n<liste.size()){return liste.get(n);}
        liste.add(climbStairs(n-1)+climbStairs(n-2));
        return liste.get(n);
    }
}
