class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:stones){
            pq.add(i);
        }
        while(pq.size()>1){
            int y=pq.poll();
            int x=pq.poll();
            if(y!=x){pq.add(y-x);}
        }
        return (pq.isEmpty())? 0 : pq.poll();
    }
}
