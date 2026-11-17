class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i=0;i<points.length;i++){
            Point temp=new Point(points[i][0],points[i][1]);
            if(pq.size()<k){
                pq.add(temp);
            }else{
                if(temp.dist<pq.peek().dist){
                    pq.poll();
                    pq.add(temp);
                }
            }
        }
        int[][] retour=new int[k][2];
        for(int i=0;i<k;i++){
            Point temp=pq.poll();
            retour[i]=new int[]{temp.x,temp.y};
        }
        return retour;

    }
}

class Point implements Comparable<Point>{
    int x;
    int y;
    int dist;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
        this.dist=x*x+y*y;
    }

    @Override
    public int compareTo(Point p){
        return p.dist-this.dist;
    }
}
