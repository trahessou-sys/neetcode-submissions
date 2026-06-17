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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int[] preIdx = {0}; // tableau de taille 1 pour simuler un compteur passé "par référence"
        return build(preorder, inorder, 0, inorder.length - 1, preIdx);
    }

    private TreeNode build(int[] preorder, int[] inorder, int left, int right, int[] preIdx) {
        if (left > right) return null;

        int rootVal = preorder[preIdx[0]];
        preIdx[0]++;
        TreeNode root = new TreeNode(rootVal);

        int mid = findIndex(inorder, left, right, rootVal);

        root.left = build(preorder, inorder, left, mid - 1, preIdx);
        root.right = build(preorder, inorder, mid + 1, right, preIdx);

        return root;
    }

    private int findIndex(int[] inorder, int left, int right, int value) {
        for (int i = left; i <= right; i++) {
            if (inorder[i] == value) return i;
        }
        return -1; // n'arrive jamais, les valeurs sont garanties uniques
    }
}
