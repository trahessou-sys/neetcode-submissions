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
        remplir(root,liste,k);
        return liste.get(k-1);
        
    }

    public void remplir(TreeNode root, List<Integer> liste,int k){
        if(root==null || liste.size()>=k){
            return;
        }else{
            remplir(root.left,liste,k);
            liste.add(root.val);
            remplir(root.right,liste,k);
        }
    }
}
