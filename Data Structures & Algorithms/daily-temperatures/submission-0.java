class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer= new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            if(i==temperatures.length-1){
                answer[i]=0;
            }else{
                if(temperatures[i+1]>temperatures[i]){
                    answer[i]=1;
                }else{
                    int k=answer[i+1]+i+1;
                    while(k<temperatures.length && temperatures[k]<=temperatures[i] && answer[k]!=0){
                        k+=answer[k];
                    }
                    if(k>=temperatures.length || (answer[k]==0 && temperatures[k]<=temperatures[i])){
                        answer[i]=0;
                    }else{
                        answer[i]=k-i;
                    }
                }
            }
        }
        return answer;
    }
}
