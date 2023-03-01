import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T>
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

public class Solution {

    public  static int findCeil(TreeNode<Integer> root, int key) {

        int ceil = -1;
        while(root != null) {
            if(root.data == key) {
                ceil = root.data;
                return ceil;
            }
            if(key < root.data) {
                ceil = root.data;
                root = root.left;
            }
            else {
                root = root.right;
            }
        }
        return ceil;

    }
}

