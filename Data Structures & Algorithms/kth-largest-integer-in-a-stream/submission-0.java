class KthLargest {
    PriorityQueue<Integer> s;
    int k;

    public KthLargest(int k, int[] nums) {
        this.s=new PriorityQueue<>();
        this.k=k;
        for(int i=0;i<nums.length;i++){
            if(i<k){
                s.add(nums[i]);
            }else{
                if(nums[i]>this.s.peek()){
                    this.s.poll();
                    this.s.add(nums[i]);
                }
            }
        }
    }
    
    public int add(int val) {
        if(s.size()<k){
            s.add(val);
        }
        else if(val>s.peek()){
            s.poll();
            s.add(val);
        }
        return s.peek();
    }
}
