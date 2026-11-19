class WordDictionary {

    public Noeud root;
    
    public WordDictionary() {
        this.root = new Noeud('\0', false); 
    }

    public void addWord(String word) {
        if(this.root==null){
            this.root=new Noeud(word.charAt(0),false);
        }
        Noeud.insert(word,this.root,0,'\0');
    }

    public boolean search(String word) {
        if(this.root==null){return false;}
        return Noeud.search(word,this.root,0);
    
    }
}

static class Noeud{
    public ArrayList<Noeud> childrens;
    public char val;
    public boolean endofword;

    public Noeud(char valo,boolean tr) {
         this.childrens = new ArrayList<>();
         this.val=valo;
         this.endofword=tr;
        
    }

    public static void insert(String word, Noeud tree,int i, char prece){
        if(i<word.length()){
            char c=word.charAt(i);
            boolean a= false;
            for(Noeud child: tree.childrens){
                if(child!=null && child.val==c){
                    a=true;
                    if(i==word.length()-1){
                        child.endofword = true;
                    } else {
                        Noeud.insert(word,child,i+1,c);
                    }
                    break;
                }
            }
            if(!a){
                Noeud cv =new Noeud(c,i==word.length()-1);
                if(i<word.length()-1){
                    Noeud.insert(word,cv,i+1,c);
                }
                tree.childrens.add(cv);
            }
        
        }
    }

    public static boolean search(String word, Noeud tree, int i){
        if(i >= word.length()){
            return false;
        }
        char c = word.charAt(i);
        for(int j=0; j<tree.childrens.size(); j++){
            Noeud child = tree.childrens.get(j);
            if(child != null && (child.val == c || c == '.')){
                if(i == word.length()-1){
                    if(child.endofword) return true; 
                } else {
                    if(search(word, child, i+1)) return true; 
                }
            }
        }
        return false;
    }  
}
