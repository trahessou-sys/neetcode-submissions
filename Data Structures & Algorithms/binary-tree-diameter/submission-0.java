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
    int r=-1;
    public int diameterOfBinaryTree(TreeNode root) {
        diam(root);
        return r;
    }

    private int diam(TreeNode root){
        if(root==null){return 0;}
        int l=diam(root.left);
        int lr=diam(root.right);

        r=Math.max(r,l+lr);

        return 1+Math.max(l,lr);
    }
}
