class Solution {

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> resultat = new ArrayList<>();
        List<Integer> test = new ArrayList<>();
        
        backtrack(nums, target, 0, test, resultat);
        
        return resultat;
    }
    private void backtrack(int[] nums, int remaining, int start, List<Integer> test, List<List<Integer>> resultat) {
        if (remaining == 0) {
            resultat.add(new ArrayList<>(test));  // copie, car 'test' va continuer à être modifié
            return;
        }
        if (remaining < 0) {
            return;  // on a dépassé la cible, cette branche est invalide
        }
        
        for (int i = start; i < nums.length; i++) {
            test.add(nums[i]);
            // on rappelle avec 'i' (pas 'i+1') car on peut réutiliser le même nombre
            backtrack(nums, remaining - nums[i], i, test, resultat);
            test.remove(test.size() - 1);  // backtrack : on retire le dernier ajouté
        }
    }
}
