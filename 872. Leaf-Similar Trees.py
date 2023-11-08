# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def leafSimilar(self, root1: Optional[TreeNode], root2: Optional[TreeNode]) -> bool:
        def isLeaf(root):
            return root.left == None and root.right == None

        def findSeq(root, leaves):
            if root == None: return

            if isLeaf(root): 
                leaves.append(root.val)
                return

            findSeq(root.left, leaves)
            findSeq(root.right, leaves)

            return

        t1 = []
        t2 = []

        findSeq(root1, t1)
        findSeq(root2, t2)

        

        return t1 == t2
        
