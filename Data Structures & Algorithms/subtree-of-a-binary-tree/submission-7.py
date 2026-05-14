# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:   
    def isSubtree(self, root, subRoot):
        if root == None and subRoot != None:
            return False
        elif root == None and subRoot == None:
            return True
        elif root != None and subRoot == None:
            return False
        else:
            if root.val == subRoot.val: 
                if self.isSameTree(root, subRoot):  # ← changement ici
                    return True
                else:
                    return self.isSubtree(root.right, subRoot) or self.isSubtree(root.left, subRoot)
            else:
                return self.isSubtree(root.right, subRoot) or self.isSubtree(root.left, subRoot)

    def isSameTree(self, p, q):             # ← fonction ajoutée
        if p is None and q is None:
            return True
        if p is None or q is None:
            return False
        return p.val == q.val and self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)