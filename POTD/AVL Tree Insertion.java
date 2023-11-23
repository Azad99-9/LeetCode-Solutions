class Solution
{
    public  Node insertToAVL(Node node,int data)
    {
        //code here
        if(node == null){
            return new Node(data);
        }
        if(data < node.data){
            node.left =insertToAVL(node.left, data);
        }
        else if(data > node.data){
            node.right =insertToAVL(node.right, data);
        }
        else return node;
        
        node.height = 1 + Math.max(height(node.left), height(node.right));
        
        int bf = getBalance(node);
        if(bf > 1 && data < node.left.data) return rightRotate(node);
        if(bf < -1 && data > node.right.data) return leftRotate(node);
        if(bf>1 && data>node.left.data){
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if(bf<-1 && data<node.right.data){
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }
    
    private Node rightRotate(Node y){
        Node x = y.left;
        Node t2 = x.right;
        x.right = y;
        y.left = t2;
        
        y.height = Math.max(height(y.left), height(y.right))+1;
        x.height = Math.max(height(x.left), height(x.right))+1;
        return x;
    }
    
    private Node leftRotate(Node x){
        Node y = x.right;
        Node t2 = y.left;
        y.left = x;
        x.right = t2;
        x.height = Math.max(height(x.left), height(x.right))+1;
        y.height = Math.max(height(y.left), height(y.right))+1;
        return y;
    }
    
    private int getBalance(Node node){
        if(node == null) return 0;
        return height(node.left)-height(node.right);
    }
    
    private int height(Node node){
        if(node==null) return 0;
        return node.height;
    }
}    


