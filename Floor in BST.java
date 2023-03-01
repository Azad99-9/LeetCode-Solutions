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
    // T - O( N )
    // S - O( 1 )
    public static int floorInBST(TreeNode<Integer> root, int key) {
        int floor = -1;
        while(root != null) {
            if(root.data == key) {
                floor = root.data;
                return floor;
            }

            if(key > root.data) {
                floor = root.data;
                root = root.right;
            }
            else {
                root = root.left;
            }

        }
        return floor;
    }












}
