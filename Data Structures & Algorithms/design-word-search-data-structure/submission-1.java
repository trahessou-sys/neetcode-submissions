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
    public Noeud[] childrens;
    public char val;
    public int nombreEnfant;
    public boolean endofword;

    public Noeud(char valo,boolean tr) {
         this.childrens = new Noeud[2];
         this.val=valo;
         this.nombreEnfant=0;
         this.endofword=tr;
        
    }

    public Noeud[] agrandir(Noeud[] tree){
        Noeud[] retour= new Noeud[tree.length*2];
        for(int i=0;i<tree.length;i++){
            retour[i]=tree[i];
        }
        return retour;
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
                    if(tree.nombreEnfant>=tree.childrens.length){
                        tree.childrens=tree.agrandir(tree.childrens);
                    }
                    Noeud cv =new Noeud(c,i==word.length()-1);
                    if(i<word.length()-1){
                        Noeud.insert(word,cv,i+1,c);
                    }
                    
                    tree.childrens[tree.nombreEnfant]=cv;
                    tree.nombreEnfant++;
                }
            
        }
    }
    
    public static boolean search(String word, Noeud tree, int i){
        if(i >= word.length()){
            return false;
        }
        char c = word.charAt(i);
        for(int j=0; j<tree.nombreEnfant; j++){
            Noeud child = tree.childrens[j];
            if(child != null && (child.val == c || c == '.')){
                if(i == word.length()-1){
                    if(child.endofword) return true; // on continue à chercher si false !
                } else {
                    if(search(word, child, i+1)) return true; // on continue si false !
                }
            }
        }
        return false; // aucune branche n'a marché
    }

    
        
}
