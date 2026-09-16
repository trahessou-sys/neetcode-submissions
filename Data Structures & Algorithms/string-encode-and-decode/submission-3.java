class Solution {
    final int n=12;

    public String encode(List<String> strs) {
        if(strs.size()==0){return "";}
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            
            for(int i=0;i<s.length();i++){
                sb.append((char)((s.charAt(i)+n)%256));
            }
            sb.append((char)258);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> retour=new ArrayList<String>();
        if(str.equals("")){return retour;}
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            if(a==(char)258){
                retour.add(sb.toString());
                sb= new StringBuilder();
            }else if(a==(char)257){
                retour.add("");
            }else{
                sb.append((char)((a-n+256)%256));
            }
        }
        return retour;
    }
}
