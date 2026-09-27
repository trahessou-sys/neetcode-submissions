class MinStack {
public Node high;

    public MinStack() {
        this.high=null;
    }
    
    public void push(int val) {
        if(this.high==null){
            this.high=new Node(val,val,null);
        }else{
            this.high=new Node(val,Math.min(val,this.high.min),this.high);
        }
        
    }
    
    public void pop() {
         this.high=this.high.next;
    }
    
    public int top() {
        return this.high.val;
    }
    
    public int getMin() {
        return this.high.min;
    }
}

class Node{
    public int val;
    public int min;
    public Node next;

    Node(int v, int m){
        this.val=v;
        this.min=m;
        this.next=null;
    }
    Node(int v, int m, Node N){
        this.val=v;
        this.min=m;
        this.next=N;
    }
}
