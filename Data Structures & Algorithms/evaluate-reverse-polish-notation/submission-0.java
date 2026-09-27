class Solution {
    public int evalRPN(String[] tokens) {
        List<Integer> retour= new ArrayList<>();
        int i=0;
        while(i<tokens.length){
            if(i==0){
                retour.add(Integer.parseInt(tokens[i]));
                i++;
            }else{
                String actu=tokens[i];
                if(actu.equals("+") || actu.equals("-") || actu.equals("/") || actu.equals("*")){
                    int a=retour.get(retour.size()-1);
                    retour.remove(retour.size()-1);
                    int b=retour.get(retour.size()-1);
                    retour.remove(retour.size()-1);
                    if(actu.equals("+")){retour.add(a+b);}
                    else if(actu.equals("-")){retour.add(b-a);}
                    else if(actu.equals("*")){retour.add(a*b);}
                    else if(actu.equals("/")){retour.add(b/a);}
                    i++;
                }else{
                    retour.add(Integer.parseInt(actu));
                    i++;
                }
            }
        }
        return retour.get(0);
    }
}
