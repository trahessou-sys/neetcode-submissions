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
    int r=0;
    public int goodNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        good(root,root.val);
        return r;
    }

    private void good(TreeNode root,int max){
        if(root==null){
            return ;
        }
        if(max<=root.val){r++;}
        good(root.left,Math.max(max,root.val));
        good(root.right,Math.max(max,root.val));
    }
}
