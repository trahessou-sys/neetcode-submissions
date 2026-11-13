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
    int retour=-1;
    public int kthSmallest(TreeNode root, int k) {
        r=0;
        retour=-1;
        dfs(root,k);
        return retour;
    }

    private void dfs(TreeNode root,int k){
        if(root==null){return;}
        if(r>k){return;}
        dfs(root.left,k);
        r++;
        if(r==k){
            retour=root.val;
        }
        dfs(root.right,k);

    }
}
