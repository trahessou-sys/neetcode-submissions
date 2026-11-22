class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> retour = new ArrayList<>();
        List<Integer> test = new LinkedList<>();
        List<Integer> calls = new LinkedList<>();
        test.add(candidates[0]);
        calls.add(0);
        int i=0;
        int sum=candidates[0];
        while(!calls.isEmpty() ){
            if(sum==target){
                retour.add(new ArrayList<>(test));
                sum-=test.removeLast();
                i=calls.removeLast()+1;

                while(i==candidates.length && !calls.isEmpty()){    
                    sum-=test.removeLast();                         
                    i=calls.removeLast()+1;                         
                } 

                if(calls.isEmpty() && i<candidates.length){
                    test.add(candidates[i]);
                    calls.add(i);
                    sum+=candidates[i];
                }
            }else if(sum>target){
                sum-=test.removeLast();
                i=calls.removeLast()+1;

                while(i==candidates.length && !calls.isEmpty()){    
                    sum-=test.removeLast();                         
                    i=calls.removeLast()+1;                         
                }                                                   
                if(calls.isEmpty() && i<candidates.length){         
                    test.add(candidates[i]);                        
                    calls.add(i);                                   
                    sum+=candidates[i];                             
                }

            }else{
                sum+=candidates[i];
                test.add(candidates[i]);
                calls.add(i);
            }
        }
        return retour;
    }
}
