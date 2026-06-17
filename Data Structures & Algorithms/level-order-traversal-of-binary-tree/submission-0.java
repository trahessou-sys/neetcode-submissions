/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Ordre(root,result,0);
        return result;
        
    }

    public void Ordre(TreeNode root,List<List<Integer>> liste, int compteur){
        if(compteur>=liste.size() && root!=null){
                for(int i=0;i<=compteur-liste.size();i++){
                    liste.add(new ArrayList<>());
                };
        }
        if(root==null){
            return;
        }else{
            
            if(root.left!=null){Ordre(root.left,liste,compteur+1);};
            if(root.right!=null){Ordre(root.right,liste,compteur+1);};

            

            liste.get(compteur).add(root.val);

        }
    }
}
