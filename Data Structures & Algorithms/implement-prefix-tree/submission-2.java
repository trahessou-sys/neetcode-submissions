class PrefixTree {
    Node arbre;

    public PrefixTree() {
        this.arbre=new Node(null,false);
    }

    public void insert(String word) {
        int k=word.length();
        if(k==0){return;}
        Node temp=arbre.insert(word.charAt(0),0==k-1);
        for(int i=1;i<k;i++){
            temp=temp.insert(word.charAt(i),i==k-1);
        }
    }

    public boolean search(String word) {
        int k=word.length();
        if(k==0){return false;}
        int i=0;
        Node temp=arbre;
        while(i<k){
            char t=word.charAt(i);
            boolean trouv=false;
            for(Node c:temp.children){
                if(c.cha==t){
                    temp=c;
                    trouv=true;
                    break;
                }
            }
            if(!trouv){
                return false;
            }
            i++;
        }
        return temp.endofword;
    }
    
    public boolean startsWith(String word) {
        int k=word.length();
        if(k==0){return false;}
        int i=0;
        Node temp=arbre;
        while(i<k){
            char t=word.charAt(i);
            boolean trouv=false;
            for(Node c:temp.children){
                if(c.cha==t){
                    temp=c;
                    trouv=true;
                    break;
                }
            }
            if(!trouv){
                return false;
            }
            i++;
        }
        return true;
    }
}

class Node{
    Character cha;
    boolean endofword;
    ArrayList<Node> children;

    Node(Character cha, boolean b){
        this.cha=cha;
        this.endofword=b;
        this.children=new ArrayList<>();
    }

    Node insert(char ca,boolean endofword){
        Node temp=null;
        for(Node c:this.children){
            if(c.cha==ca){
                temp=c;
                break;
            }
        }
        if(temp!=null){
            if(endofword){temp.endofword=true;}
            return temp;
        }
        temp=new Node(ca,endofword);
        this.children.add(temp);
        return temp;
    }
}
