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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){return subRoot==null;}
        if(subRoot==null){return root==null;}
        if(root.val==subRoot.val && isTree(root,subRoot)){
            return true;
        }
        return isSubtree(root.right,subRoot) || isSubtree(root.left,subRoot);
        
    }

    public boolean isTree(TreeNode p, TreeNode q){
        if(p==null && q==null){return true;}
        if((p==null)^(q==null)){return false;}
        if(p.val!=q.val){return false;}
        return isTree(p.right,q.right) && isTree(p.left,q.left);
    }
}
