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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> liste = new ArrayList<>();
        remplir(root,liste,0,k);
        return liste.get(k-1);
        
    }

    public void remplir(TreeNode root, List<Integer> liste,int compt,int k){
        if(root==null || compt>=k){
            return;
        }else{
            remplir(root.left,liste,compt,k);
            liste.add(root.val);
            compt=compt+1;
            remplir(root.right,liste,compt,k);
        }
    }
}
