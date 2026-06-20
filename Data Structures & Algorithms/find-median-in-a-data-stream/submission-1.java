class MedianFinder {

    private ArrayList<Integer> arr;
    private int nbr;

    public MedianFinder() {
        this.arr = new ArrayList<>();
        this.nbr=0;
    }
    
    public void addNum(int num) {
        int i=0;
        while(i<this.nbr && this.arr.get(i)<num){
            i=i+1;
        }
        this.arr.add(i,num);
        this.nbr+=1;
    }
    
    public double findMedian() {
        int k=this.nbr;
        if(k==1){
            return this.arr.get(0);
        }
        if(k%2==1){
            return this.arr.get((k-1)/2);
        }else{
            return (this.arr.get(k/2)+this.arr.get((k/2)-1))/ (double)2;
        }
        
    }
}
