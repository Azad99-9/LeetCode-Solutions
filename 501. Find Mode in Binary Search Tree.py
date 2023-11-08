class Solution:
    def findMode(self, root: Optional[TreeNode]) -> List[int]:
        counts = {}
        maxi = 0
        modes = []

        def inorder(root):
            if not root: return

            inorder(root.left)

            nonlocal maxi, modes

            counts[root.val] = 1 + counts.get(root.val, 0)

            if counts[root.val] > maxi:
                modes = [root.val]
                maxi = counts[root.val]
            elif counts[root.val] == maxi:
                modes.append(root.val)

            inorder(root.right)

        inorder(root)
        return modes
