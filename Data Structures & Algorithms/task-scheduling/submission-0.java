class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] frd=new int[26];
        for(char c : tasks){
            frd[c-'A']++;
        }
        PriorityQueue<Integer> maxHeap =new PriorityQueue<>((a, b) -> b - a);
        for(int i = 0; i < 26; i++) {
            if(frd[i] > 0) {
                maxHeap.add(frd[i]);
            }
        }

        int r=0;
        while(!maxHeap.isEmpty()){
            int cycle=0;
            int d=n+1;
            ArrayList<Integer> list=new ArrayList<>();

            while(d>0 && !maxHeap.isEmpty()){
                int c=maxHeap.poll();
                if(c>1){
                    list.add(c-1);
                }
                cycle++;
                d--;
            }

            for(int e:list){
                maxHeap.add(e);
            }
            r+=(maxHeap.isEmpty())? cycle : n+1;
        }
        return r;
    }
}
