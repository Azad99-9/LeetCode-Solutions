# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def tree2str(self, root: Optional[TreeNode]) -> str:
        def convert(root):
            if not root: return ""

            s = str(root.val)

            if root.left != None or root.right != None:
                s += "(" + convert(root.left) + ")"

            if root.right != None:
                s += "(" + convert(root.right) + ")"
            return s

        su = convert(root)
        return su


