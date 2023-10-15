class Solution:
    def buildBalancedTree(self,root):
        
        def createList(root, ans):
            if root is None:
                return
            
            createList(root.left, ans)
            ans.append(root)
            createList(root.right, ans)
            
        def modifyTree(ans, l, r):
            if l > r: return None
            
            mid = (l + r) // 2
            
            cur = ans[mid]
            
            cur.left = modifyTree(ans, l, mid - 1)
            cur.right = modifyTree(ans, mid + 1, r)
            
            return cur
            
            
        ans = []
        createList(root, ans)
        return modifyTree(ans, 0, len(ans) - 1)
        
        
        