class Solution:
    
    #Function to find the nodes that are common in both BST.
    def findCommon(self, root1, root2):
        
        def inorder1(root, se):
            if root is None: return
        
            se.add(root.data)
            inorder1(root.left, se)
            inorder1(root.right, se)
            
        def inorder2(root, se, ans):
            if root is None: return
        
            if root.data in se: ans.append(root.data)
            inorder2(root.left, se, ans)
            inorder2(root.right, se, ans)
        se = set()
        ans = []
        inorder1(root1, se)
        inorder2(root2, se, ans)
        ans = sorted(ans)
        return ans
        
