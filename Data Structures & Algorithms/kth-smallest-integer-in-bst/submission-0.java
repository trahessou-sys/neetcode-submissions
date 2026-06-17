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
        remplir(root,liste);
        return liste.get(k-1);
        
    }

    public void remplir(TreeNode root, List<Integer> liste){
        if(root==null){
            return;
        }else{
            remplir(root.left,liste);
            liste.add(root.val);
            remplir(root.right,liste);
        }
    }
}
