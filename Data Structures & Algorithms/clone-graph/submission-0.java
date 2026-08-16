/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/



class Solution {
    public Node cloneGraph(Node node) {
        Map<Node, Node> nodes = new HashMap<>();
        return dfs(node,nodes);
    }

    public Node dfs(Node node, Map<Node, Node> liste){
        if(node==null){return null;}
        if(liste.containsKey(node)){
            return liste.get(node);
        }
        Node copy= new Node(node.val);
        liste.put(node,copy);
        for(Node nei: node.neighbors){
            copy.neighbors.add(dfs(nei,liste));
        }
        return copy;
    }
}