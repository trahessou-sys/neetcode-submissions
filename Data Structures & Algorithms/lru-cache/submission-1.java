class LRUCache {
    int capacity;
    HashMap<Integer,Entry> table;
    final Entry head=new Entry(0,null);
    final Entry tail=new Entry(0,null);

    public LRUCache(int capacity) {
        this.table=new HashMap<>();
        this.capacity=capacity;
        this.head.next=tail;
        this.tail.prev=head;
    }

    public void insertFirst(Entry x){
        Entry p=head.next;
        head.next=x;
        p.prev=x;
        x.next=p;
        x.prev=head;
    }

    public void unlink(Entry x){
        Entry p=x.next;
        x.prev.next=p;
        p.prev=x.prev;
        x.prev=null;
        x.next=null;
    }
    
    public int get(int key) {
        if(table.containsKey(key)){
            Entry x=table.get(key);
            unlink(x);
            insertFirst(x);
            return x.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(table.containsKey(key)){
            Entry x=table.get(key);
            x.value=value;
            unlink(x);
            insertFirst(x);
            return;
        }
        Entry x =new Entry(key,value);
        if(table.size()<capacity){
            table.put(key,x);
            insertFirst(x);
            return;
        }
        Entry p=tail.prev;
        unlink(p);
        insertFirst(x);
        table.remove(p.key);
        table.put(key,x);
    }
}

public class Entry{
    int key;
    Integer value;
    Entry next,prev;

    Entry(int key, Integer value){
        this.key=key;
        this.value=value;
    }
}

