class Solution {
    public boolean isValid(String s) {
        if(s.length()%2==1){return false;}
        ArrayList<Character> s1 = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(open(s.charAt(i))){
                s1.add(s.charAt(i));
            }else{
                if(s1.isEmpty()){return false;}
                if(!close(s1.remove(s1.size()-1),s.charAt(i))){
                    return false;
                }
            }
        }
        return s1.isEmpty();
        
    }

    public boolean open(char a){
        return a=='{' || a=='(' || a=='[';
    }

    public boolean close(char a, char b){
        if(a=='(' && b==')'){return true;}
        if(a=='{' && b=='}'){return true;}
        if(a=='[' && b==']'){return true;}
        return false;
    }

    
}
