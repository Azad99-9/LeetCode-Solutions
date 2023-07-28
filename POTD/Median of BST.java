if (root == null)
        return 0;
 
    int count = counNodes(root);
    int currCount = 0;
    Node current = root, pre = null, prev = null;
 
    while (current != null)
    {
        if (current.left == null)
        {
            // count current node
            currCount++;
 
            // check if current node is the median
            // Odd case
            if (count % 2 != 0 && currCount == (count+1)/2)
                return current.data;
 
            // Even case
            else if (count % 2 == 0 && currCount == (count/2)+1)
                return (prev.data + current.data)/2;
 
            // Update prev for even no. of nodes
            prev = current;
 
            //Move to the right
            current = current.right;
        }
        else
        {
            /* Find the inorder predecessor of current */
            pre = current.left;
            while (pre.right != null && pre.right != current)
                pre = pre.right;
 
            /* Make current as right child of its inorder predecessor */
            if (pre.right == null)
            {
                pre.right = current;
                current = current.left;
            }
 
            /* Revert the changes made in if part to restore the original
            tree i.e., fix the right child of predecessor */
            else
            {
                pre.right = null;
 
                prev = pre;
 
                // Count current node
                currCount++;
 
                // Check if the current node is the median
                if (count % 2 != 0 && currCount == (count+1)/2 )
                    return current.data;
 
                else if (count%2==0 && currCount == (count/2)+1)
                    return (prev.data+current.data)/2;
 
                // update prev node for the case of even
                // no. of nodes
                prev = current;
                current = current.right;
 
            } /* End of if condition pre->right == NULL */
        } /* End of if condition current->left == NULL*/
    } /* End of while */
    return -1;