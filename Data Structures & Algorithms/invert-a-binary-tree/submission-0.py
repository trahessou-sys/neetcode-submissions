# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def invertTree(self, root):
        if root==None:
            return root
        if root.right!=None or root.left!=None:
            a=root.right
            b=root.left
            root.right=b
            root.left=a
            self.invertTree(root.right)
            self.invertTree(root.left)
            
        return root
        