class MinStack {
    public ArrayList<Node> list;

    public MinStack() {
        this.list=new ArrayList<>();
    }
    
    public void push(int val) {
        if(this.list.isEmpty()){this.list.add(new Node(val,val));}
        else{
            this.list.add(new Node(val,Math.min(val,this.list.get(this.list.size()-1).min)));
        }
        
    }
    
    public void pop() {
         this.list.remove(this.list.size()-1);
    }
    
    public int top() {
        return this.list.get(this.list.size()-1).val;
    }
    
    public int getMin() {
        return this.list.get(this.list.size()-1).min;
    }
}

class Node{
    public int val;
    public int min;

    Node(int v, int m){
        this.val=v;
        this.min=m;
    }
}
