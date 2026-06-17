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
    public boolean isValidBST(TreeNode root) {
        if(root==null){return true;};
        return valid(root,null,null);
        
    }

    public boolean valid(TreeNode root, TreeNode min, TreeNode max){
        if(root==null){return true;}
        else{

            boolean a= (min==null)? true : root.val>min.val;
            boolean b= (max==null)? true : root.val<max.val;
            if(!(a&&b)){return false;}
            else{
                boolean ag=valid(root.left,min,root);
                boolean ad=valid(root.right,root,max);
                return ag&&ad;
            }
        }
    }
}
