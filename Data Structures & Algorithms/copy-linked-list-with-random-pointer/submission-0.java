/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> verf = new HashMap<>();
        return copyf(head,verf);
    }

    public Node copyf(Node head, HashMap<Node,Node> map){
        if(head==null){return null;}
        if(map.containsKey(head)){
            return map.get(head);
        }
        Node r = new Node(head.val);
        map.put(head,r);
        r.next=copyf(head.next,map);
        r.random=copyf(head.random,map);
        
        return r;
    }
}
