class Solution
{
    private static void ino(Node root, ArrayList<Integer> asc) {
        if (root == null) return;
        
        ino(root.left, asc);
        asc.add(root.data);
        ino(root.right, asc);
    }
    
    private static void mkHeap(Node root, ArrayList<Integer> asc) {
        if (root == null) return;
        
        root.data = asc.remove(asc.size() - 1);
        mkHeap(root.right, asc);
        mkHeap(root.left, asc);
    }
    
    public static void convertToMaxHeapUtil(Node root)
    {
        ArrayList<Integer> asc = new ArrayList<>();
        ino(root, asc);
        mkHeap(root, asc);
    }
}
