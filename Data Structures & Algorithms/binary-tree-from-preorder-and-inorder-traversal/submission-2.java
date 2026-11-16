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
    HashMap<Integer,Integer> map;
    int index;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map=new HashMap<>();
        index=0;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return construct(preorder,0,inorder.length-1);
    }

    public TreeNode construct(int[] preorder,int low, int high){
        if(low>high){return null;}
        int val=preorder[index++];

        TreeNode node=new TreeNode(val);

        int inod=map.get(val);

        node.left=construct(preorder,low,inod-1);
        node.right=construct(preorder,inod+1,high);
        return node;


    }
}
